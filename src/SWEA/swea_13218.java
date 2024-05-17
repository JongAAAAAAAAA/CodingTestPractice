package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_13218 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            n = Integer.parseInt(br.readLine());

            System.out.println("#" + T + " " + n / 3);
        }
    }
}