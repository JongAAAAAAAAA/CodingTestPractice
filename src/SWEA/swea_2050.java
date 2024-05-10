package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class swea_2050 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String s;

    public static void main(String args[]) throws Exception {
        s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.printf("%c", s);
        }
    }
}