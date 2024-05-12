package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1945 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, a, b, c, d, e;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            n = Integer.parseInt(br.readLine());
            a = b = c = d = e = 0;

            while (n % 11 == 0) {
                e++;
                n /= 11;
            }

            while (n % 7 == 0) {
                d++;
                n /= 7;
            }

            while (n % 5 == 0) {
                c++;
                n /= 5;
            }

            while (n % 3 == 0) {
                b++;
                n /= 3;
            }

            while (n % 2 == 0) {
                a++;
                n /= 2;
            }

            System.out.println("#" + i + " " + a + " " + b + " " + c + " " + d + " " + e);
        }
    }
}
