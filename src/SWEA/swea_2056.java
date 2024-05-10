package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class swea_2056 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, M, D;
    static String s, y, m, d;

    public static void main(String args[]) throws Exception {
        t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            s = br.readLine();
            y = s.substring(0, 4);
            m = s.substring(4, 6);
            d = s.substring(6, 8);

            M = Integer.parseInt(m);
            D = Integer.parseInt(d);

            if (M < 1 || M > 12 || D < 1 || D > 31) {
                System.out.println("#" + i + " -1");
            } else if (M == 2 && D > 28) {
                System.out.println("#" + i + " -1");
            } else if (M == 4 || M == 6 || M == 9 || M == 11 && D > 30) {
                System.out.println("#" + i + " -1");
            } else {
                System.out.println("#" + i + " " + y + "/" + m + "/" + d);
            }
        }
    }
}