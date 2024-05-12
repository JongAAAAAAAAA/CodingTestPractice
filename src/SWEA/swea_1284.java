package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1284 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, p, q, r, s, w, a, b;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            p = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            a = companyA(p, w);
            b = companyB(q, r, s, w);

            if (a > b) {
                System.out.println("#" + i + " " + b);
            } else {
                System.out.println("#" + i + " " + a);
            }
        }
    }

    static int companyA(int p, int w) {
        return p * w;
    }

    static int companyB(int q, int r, int s, int w) {
        if (r >= w) {
            return q;
        } else {
            return q + (w - r) * s;
        }
    }
}
