package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_16910 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, cnt;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            n = Integer.parseInt(br.readLine());

            cnt = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) <= Math.pow(n, 2)) {
                        cnt++;
                    }
                }
            }
            cnt = (cnt + n) * 4 + 1;

            System.out.println("#" + T + " " + cnt);
        }
    }
}
