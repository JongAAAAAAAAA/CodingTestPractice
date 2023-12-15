package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * boj 11399 : ATM
 * Prefix Sum
 */

public class b11399_PrefixSum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, minTime;
    static int[] p, sumArr;

    static int prefixSum(int[] sumArr, int[] p, int n) {
        for (int i = 0; i < n; i++) {
            sumArr[i + 1] += sumArr[i] + p[i];
        }
        for (int i = 0; i < n + 1; i++) {
            minTime += sumArr[i];
        }
        return minTime;
    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        p = new int[n];
        sumArr = new int[n + 1];
        sumArr[0] = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(p);

        System.out.println(prefixSum(sumArr, p, n));
    }
}
