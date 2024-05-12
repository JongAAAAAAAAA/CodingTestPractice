package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class swea_1948 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, answer, interval, intervalSum;
    static int[] arr;
    static HashMap<Integer, Integer> calendar = new HashMap<>();

    public static void main(String[] args) throws IOException {
        calendar.put(1, 31);
        calendar.put(2, 28);
        calendar.put(3, 31);
        calendar.put(4, 30);
        calendar.put(5, 31);
        calendar.put(6, 30);
        calendar.put(7, 31);
        calendar.put(8, 31);
        calendar.put(9, 30);
        calendar.put(10, 31);
        calendar.put(11, 30);
        calendar.put(12, 31);

        t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            arr = new int[4];
            intervalSum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            if (arr[0] == arr[2]) {
                answer = arr[3] - arr[1] + 1;
            } else {
                interval = arr[2] - arr[0] - 1;
                for (int j = 0; j < interval; j++) {
                    intervalSum += calendar.get(arr[2] - 1 - j);
                }
                answer = calendar.get(arr[0]) - arr[1] + 1 + arr[3] + intervalSum;
            }
            System.out.println("#" + i + " " + answer);
        }
    }
}
