package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1204 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, max, tmp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            arr = new int[101];
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            max = tmp = 0;
            for (int i = 0; i < 1000; i++) {
                arr[Integer.parseInt(st.nextToken())]++;
            }

            //arr : 빈도수 체크배열
            for (int i = 0; i < 100; i++) {
                if (arr[i] >= max) {
                    max = arr[i];
                    tmp = i;
                }
            }
            System.out.println("#" + T + " " + tmp);
        }
    }
}
