package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * boj 11399 : ATM
 * Greedy Algorithm
 */

public class b11399_Greedy {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, sum, minTime;
    static int[] p;

    static int greedy(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
            minTime += sum;
        }
        return minTime;
    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        p = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(p);

        System.out.println(greedy(p, n));
    }
}
