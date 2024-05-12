package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1959 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, m, min, max, sum, maxSum;
    static int[] nArr, mArr;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            maxSum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            nArr = new int[n];
            mArr = new int[m];

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                nArr[j] = Integer.parseInt(st2.nextToken());
            }

            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                mArr[j] = Integer.parseInt(st3.nextToken());
            }

            if (n >= m) {
                min = m;
                max = n;
                for (int j = 0; j < nArr.length - mArr.length + 1; j++) {
                    sum = 0;
                    for (int k = j; k < j + min; k++) {
                        sum += mArr[k - j] * nArr[k];
                    }
                    if (sum >= maxSum) {
                        maxSum = sum;
                    }
                }

            } else {
                min = n;
                max = m;
                for (int j = 0; j < mArr.length - nArr.length + 1; j++) {
                    sum = 0;
                    for (int k = j; k < j + min; k++) {
                        sum += nArr[k - j] * mArr[k];
                    }
                    if (sum >= maxSum) {
                        maxSum = sum;
                    }
                }
            }
            System.out.println("#" + i + " " + maxSum);
        }
    }
}
