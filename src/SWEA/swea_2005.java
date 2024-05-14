package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_2005 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int T = 1; T <= t; T++) {
            n = Integer.parseInt(br.readLine());
            System.out.println("#" + T);
            for (int i = 0; i < n; i++) {
                String s = Integer.toString((int) Math.pow(11, i));
                for (int j = 0; j < s.length(); j++) {
                    System.out.print(s.charAt(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
