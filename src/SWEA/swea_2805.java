package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_2805 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];

            for (int i = 0; i < n; i++) { // 배열 채우기
                String s = br.readLine();
                for (int j = 0; j < n; j++) {
                    char c = s.charAt(j);
                    arr[i][j] = Integer.parseInt(String.valueOf(c));
                }
            }

//            System.out.println("arr = " + Arrays.deepToString(arr));

            System.out.println("#" + T + " " + calc(arr, n));
        }
    }

    static int calc(int[][] arr, int n) {
        int sum = 0;

        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = n / 2 - i; j < n / 2 + i + 1; j++) {
                sum += arr[i][j];
            }
        }
        for (int i = n / 2 + 1; i < n; i++) {
            for (int j = i - n / 2; j < n - (i - n / 2); j++) {
                sum += arr[i][j];
            }
        }

        return sum;
    }
}
