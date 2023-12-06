package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * boj 2606 : 바이러스
 * DFS - Stack
 */

public class b2606_Stack {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 인접 리스트 초기화
        for (int i = 0; i < n + 1; i++) { // 크기가 n+1 인 이유는 0번 인덱스 사용하지 않기 때문.
            graph.add(new ArrayList<>());
        }

        boolean[] isVisited = new boolean[n + 1]; // 방문 배열 초기화, 크기가 n+1 인 이유는 0번 인덱스 사용하지 않기 때문.

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) { // 인접 리스트 채우기.
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());

            graph.get(i1).add(i2);
            graph.get(i2).add(i1); // {{2}, {1}} 가 동일하기 때문에 넣어준다.
        }
        System.out.println("graph = " + graph);

        Stack<Integer> stack = new Stack<>();

        int startNode = 1;
        stack.push(startNode);
        isVisited[startNode] = true;
        Integer poppedNumber;

        while (!stack.isEmpty()) {
            poppedNumber = stack.pop();

            for (int i = 0; i < graph.get(poppedNumber).size(); i++) {
                Integer node = graph.get(poppedNumber).get(i);

                if (!isVisited[node]) {
                    stack.push(node);
                    isVisited[node] = true;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < isVisited.length; i++) {
            if (isVisited[i]) {
                cnt++;
            }
        }

        System.out.println(cnt - 1);
    }
}
