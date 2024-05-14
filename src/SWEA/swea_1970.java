package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1970 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, a, b, c, d, e, f, g, h;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int T = 1; T <= t; T++) {
            sb = new StringBuilder();
            n = Integer.parseInt(br.readLine());

            System.out.println("#" + T + "\n" + calculator(sb, n));
        }
    }

    static StringBuilder calculator(StringBuilder sb, int n) {
        a = n / 50000;
        n -= a * 50000;
        b = n / 10000;
        n -= b * 10000;
        c = n / 5000;
        n -= c * 5000;
        d = n / 1000;
        n -= d * 1000;
        e = n / 500;
        n -= e * 500;
        f = n / 100;
        n -= f * 100;
        g = n / 50;
        n -= g * 50;
        h = n / 10;

        sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(e).append(" ")
                .append(f).append(" ").append(g).append(" ").append(h);

        return sb;
    }
}
