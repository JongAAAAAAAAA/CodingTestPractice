package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1989 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb;
    static int t, mid;
    static String s, s1, s2;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            s = br.readLine();
            sb = new StringBuilder();

            if (s.length() % 2 != 0) { // 글자 수 홀수인 경우
                mid = s.length() / 2 + 1;
                s1 = s.substring(0, mid - 1);
            } else {
                mid = s.length() / 2;
                s1 = s.substring(0, mid);
            }
            s2 = s.substring(mid);
            s2 = sb.append(s2).reverse().toString();
            if (s1.equals(s2)) {
                System.out.println("#" + i + " " + 1);
            } else {
                System.out.println("#" + i + " " + 0);
            }
        }
    }
}
