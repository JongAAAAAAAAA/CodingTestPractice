package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1208 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        for (int T = 1; T <= 10; T++) {
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr = new int[100];

            for (int i = 0; i < 100; i++) { // 리스트 채우기
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            System.out.println("#" + T + " " + dump(arr, n));
        }
    }

    static int dump(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[0] += 1;
            arr[99] -= 1;
            Arrays.sort(arr);
        }

        return arr[99] - arr[0];
    }
}

