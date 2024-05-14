package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1926 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(rules(i) + " ");
        }
    }

    static String rules(int n) {
        StringBuilder s = new StringBuilder(Integer.toString(n));
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '3' || c == '6' || c == '9') {
                count++;
            }
        }
        if (count > 0) {
            s = new StringBuilder();
            s.append("-".repeat(count));
        }
        return s.toString();
    }
}
