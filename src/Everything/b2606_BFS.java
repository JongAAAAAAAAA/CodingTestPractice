package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * boj 2606 : 바이러스
 * BFS
 */

public class b2606_BFS {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m, cnt;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] isVisited;
    static Queue<Integer> queue = new LinkedList<>();
    static void bfs(int start){
        queue.add(start);
        isVisited[start] = true;

        while(!queue.isEmpty()){
            Integer vertex1 = queue.poll();
            int size1 = graph.get(vertex1).size();
            for (int i = 0; i < size1; i++) {
                Integer vertex = graph.get(vertex1).get(i);
                if(!isVisited[vertex]){
                    queue.add(vertex);
                    isVisited[vertex] = true;
                    cnt++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        isVisited = new boolean[n + 1]; // 방문 배열 세팅

        for (int i = 0; i < n + 1; i++) { // 인접 리스트 세팅
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) { // 인접 리스트 채우기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());

            graph.get(i1).add(i2);
            graph.get(i2).add(i1);
        }
//        System.out.println("graph = " + graph);
        int start = 1;
        bfs(start);

        System.out.println(cnt);
    }
}
