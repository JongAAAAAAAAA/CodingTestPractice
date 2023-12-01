package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * boj 2559 : 수열 합
 * 슬라이딩 윈도우
 */

public class b2559 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()); // 윈도우 크기
        int[] arr = new int[n];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < k; i++) {
            sum += arr[i];

        }
        if (n == k) {
            max = sum;
        }

        for (int i = 0; i < n - k; i++) {
            if (sum > max) {
                max = sum;
            }

            sum = sum - arr[i] + arr[i + k];
        }

        if (sum > max) {
            max = sum;
        }

        System.out.println(max);
    }
}