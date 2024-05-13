package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1979 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, k, check, cnt;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[n + 2][n + 2];
            for (int j = 0; j < n + 2; j++) { // 왼쪽 0 채우기
                arr[j][0] = 0;
            }
            for (int j = 0; j < n + 2; j++) { // 오른쪽 0 채우기
                arr[j][n + 1] = 0;
            }
            for (int j = 0; j < n + 2; j++) { // 위 0 채우기
                arr[0][j] = 0;
            }
            for (int j = 0; j < n + 2; j++) { // 아래 0 채우기
                arr[n + 1][j] = 0;
            }

            for (int j = 1; j < n + 1; j++) { // 배열 채우기
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for (int l = 1; l < n + 1; l++) {
                    arr[j][l] = Integer.parseInt(st2.nextToken());
                }
            }

            cnt = 0;
            //가로 검사
            for (int j = 0; j < n + 2; j++) {
                for (int l = 0; l < n - k + 3; l++) {
                    check = 0;
                    for (int m = l; m < l + k; m++) {
                        check += arr[j][m];
                        if (check == k && arr[j][m - k] == 0 && arr[j][m + 1] == 0) {
                            cnt++;
                        }
                    }
                }
            }

            //새로 검사
            for (int j = 0; j < n + 2; j++) {
                for (int l = 0; l < n - k + 3; l++) {
                    check = 0;
                    for (int m = l; m < l + k; m++) {
                        check += arr[m][j];
                        if (check == k && arr[m + 1][j] == 0 && arr[m - k][j] == 0) {
                            cnt++;
                        }
                    }
                }
            }

            System.out.println("#" + i + " " + cnt);
        }
    }
}
