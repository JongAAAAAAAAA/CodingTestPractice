package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * boj 1003 : 피보나치 함수
 * DP
 */

public class b1003 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n;
    static int[] dp;

    static int fn(int n) {
        if (dp[n] != -1) { // 기존에 계산했던 경우
            return dp[n];
        } else {
            return dp[n] = fn(n - 1) + fn(n - 2);
        }
    }

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());

            dp = new int[n + 2];
            for (int j = 0; j < n + 2; j++) {
                dp[j] = -1;
            }
            dp[0] = 0;
            dp[1] = 1;

            fn(n);

            if (n == 0) {
                System.out.println(1 + " " + dp[n]);
            } else {
                System.out.println(dp[n - 1] + " " + dp[n]);
            }
        }
    }
}
