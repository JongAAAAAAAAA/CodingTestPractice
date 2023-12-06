package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * boj 2606 : DFS 와 BFS
 * DFS & BFS
 */

public class b1260 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m, v, cnt;
    static Queue<Integer> queue = new LinkedList<>();
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] isVisited;
    static int[] dfsArr;
    static int[] bfsArr;

    static void dfs(int start) {
        isVisited[start] = true;
        int size = graph.get(start).size();
        dfsArr[0] = v;

        for (int i = 0; i < size; i++) {
            Integer vertex = graph.get(start).get(i);
            if (!isVisited[vertex]) {
                dfsArr[cnt+1] = vertex;
                cnt++;
                dfs(vertex);
            }
        }
    }

    static void bfs(int start) {
        bfsArr[0] = v;

        queue.add(start);
        isVisited[start] = true;

        while(!queue.isEmpty()){
            Integer poll = queue.poll();
            int size = graph.get(poll).size();

            for (int i = 0; i < size; i++) {
                Integer vertex = graph.get(poll).get(i);
                if (!isVisited[vertex]){
                    queue.add(vertex);
                    isVisited[vertex] = true;
                    bfsArr[cnt+1] = vertex;
                    cnt++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        isVisited = new boolean[n + 1]; // 방문 배열 세팅
        dfsArr = new int[n]; // 탐색 순서 세팅
        bfsArr = new int[n]; // 탐색 순서 세팅

        for (int i = 0; i < n + 1; i++) { // 인접 리스트 세팅
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) { // 인접 리스트 채우기
            st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());

            graph.get(i1).add(i2);
            graph.get(i2).add(i1);
        }

        for (int i = 0; i < graph.size(); i++) { // 오름차순 세팅
            Collections.sort(graph.get(i));
        }
//        System.out.println("graph = " + graph);

        dfs(v);
        for (int i : dfsArr) {
            if (i != 0)
                System.out.print(i + " ");
        }

        isVisited = new boolean[n + 1]; // 방문 배열 재세팅
        cnt = 0; // cnt 재세팅
        System.out.println();

        bfs(v);
        for (int i : bfsArr) {
            if (i != 0)
                System.out.print(i + " ");
        }
    }
}