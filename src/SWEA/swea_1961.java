package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class swea_1961 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;
    static int t, n, sum, q;
    static int[] answer;
    static int[][] arr, newArr;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            answer = new int[n * n];

            for (int j = 0; j < n; j++) { // 배열 채우기
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < n; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            q = 0;
            rotation(arr, n);

            sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                for (int k = j; k <= j + 2 * n; k += n) {
                    sb.append(String.format("%0" + n + "d", answer[k])).append(" ");
                }
                sb.append("\n");
            }
            System.out.print("#" + i + "\n" + sb);
        }
    }

    static int[][] rotation(int[][] arr, int count) {
        if (count == 0) {
            return newArr;
        }

        newArr = new int[n][n];

        for (int i = 0; i < arr.length; i++) { // 90 degree rotation code
            for (int j = 0; j < arr.length; j++) {
                newArr[j][arr.length - 1 - i] = arr[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += newArr[i][j] * (Math.pow(10, n - j - 1));
            }
            answer[q] = sum;
            q++;
        }
        count--;
        return rotation(newArr, count);
    }
}
