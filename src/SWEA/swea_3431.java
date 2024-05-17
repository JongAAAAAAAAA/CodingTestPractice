package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_3431 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, l, u, x;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken());
            u = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());

            if (x >= l && x <= u) {
                System.out.println("#" + T + " " + "0");
            } else if (l > x) {
                System.out.println("#" + T + " " + (l - x));
            } else {
                System.out.println("#" + T + " " + "-1");
            }
        }
    }
}
