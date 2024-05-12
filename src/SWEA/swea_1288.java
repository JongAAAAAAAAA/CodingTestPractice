package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1288 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, trueCount, cnt;
    static String subString, newS;
    static boolean[] arr;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            n = Integer.parseInt(br.readLine());
            cnt = 1;
            arr = new boolean[10];

            while (true) {
                trueCount = 0;
                newS = String.valueOf(n * cnt);
                for (int j = 0; j < 10; j++) {
                    if (arr[j]) {
                        trueCount++;
                    }
                }
                if (trueCount == 10) {
                    System.out.println("#" + i + " " + n * (cnt - 1));
                    break;
                }

                for (int j = 0; j < newS.length(); j++) {
                    subString = newS.substring(j, j + 1);
                    arr[Integer.parseInt(subString)] = true;
                }
                cnt++;
            }
        }
    }
}
