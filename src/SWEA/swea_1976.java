package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1976 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, h1, h2, m1, m2, h3, m3, r1;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h1 = Integer.parseInt(st.nextToken());
            m1 = Integer.parseInt(st.nextToken());
            h2 = Integer.parseInt(st.nextToken());
            m2 = Integer.parseInt(st.nextToken());

            r1 = (m1 + m2) / 60; // 분 넘치는 거
            m3 = (m1 + m2) % 60;
            h3 = (h1 + h2 + r1) % 12;

            if (h3 == 0) {
                h3 = 12;
            }

            System.out.println("#" + T + " " + h3 + " " + m3);
        }
    }
}
