package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1986 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, sum;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            n = Integer.parseInt(br.readLine());
            sum = 0;

            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    sum -= j;
                } else {
                    sum += j;
                }
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}
