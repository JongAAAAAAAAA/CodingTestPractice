package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * boj 9372 : 상근이의 여행
 * Graph
 */

public class b9372 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, m, a, b, cnt;
    static boolean[] isVisited;
    static ArrayList<ArrayList<Integer>> graph;
    static Queue<Integer> queue = new LinkedList<>();

    static int bfs(int start) {
        cnt = 0;
        queue.add(start);
        isVisited[start] = true;

        while(!queue.isEmpty()){
            Integer poll = queue.poll();
            int size = graph.get(poll).size();
            for (int i = 0; i < size; i++) {
                Integer node = graph.get(poll).get(i);
                if (!isVisited[node]){
                    isVisited[node] = true;
                    queue.add(node);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            isVisited = new boolean[n + 1];
            graph = new ArrayList<>();
            for (int j = 0; j < n + 1; j++) {
                graph.add(new ArrayList<>());
            }

            for (int j = 0; j < m; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st2.nextToken());
                b = Integer.parseInt(st2.nextToken());
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            System.out.println(bfs(a));
//            System.out.println("graph = " + graph);
        }
    }
}
