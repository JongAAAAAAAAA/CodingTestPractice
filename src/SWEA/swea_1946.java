package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1946 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, k, cnt, space;
    static String c;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            n = Integer.parseInt(br.readLine());
            sb = new StringBuilder();
            cnt = 0;
            space = 1;
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                c = st.nextToken();
                k = Integer.parseInt(st.nextToken());
                cnt += k;

//                sb.append(c.repeat(k));
                for (int j = 0; j < k; j++) {
                    sb.append(c);
                }
            }
            while (cnt > 10) {
                sb.insert((space * 10) + (space - 1), "\n");
                cnt -= 10;
                space++;
            }
            System.out.println("#" + T + "\n" + sb);
        }
    }
}
