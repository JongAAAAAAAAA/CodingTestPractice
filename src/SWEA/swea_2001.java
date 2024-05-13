package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_2001 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, m, max, sum;
    static int[][] nArr;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            nArr = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    nArr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            max = 0;
            for (int i = 0; i < n - m + 1; i++) {
                for (int j = 0; j < n - m + 1; j++) {
                    sum = 0;
                    for (int k = i; k < i + m; k++) {
                        for (int l = j; l < j + m; l++) {
                            sum += nArr[k][l];
                        }
                        if (sum >= max) {
                            max = sum;
                        }
                    }
                }
            }
            System.out.println("#" + T + " " + max);
        }
    }
}
