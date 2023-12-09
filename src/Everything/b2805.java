package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * boj 2805 : 나무 자르기
 * Binary Search
 */

public class b2805 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m, h, low, high, mid;
    static long sum, min = Long.MAX_VALUE;
    static int[] arr;

    static void binarySearch() {
        while (low <= high) {
            sum = 0;
            mid = (high + low) / 2;
//            System.out.println("mid = " + mid);
            for (int i = 0; i < n; i++) {
                if (arr[i] >= mid) {
                    sum += arr[i] - mid;
                }
            }
//            System.out.println("sum = " + sum);
            if (sum > m) {
                low = mid + 1;
            } else if (sum < m) {
                high = mid - 1;
            } else {
                h = mid;
                break;
            }
//            System.out.println("low = " + low);
//            System.out.println("high = " + high);
            long abs = Math.abs(sum - m);
            if (abs < min && sum > m) {
                min = abs;
                h = mid;
//                System.out.println("min = " + min);
            }
        }
        System.out.println(h);
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        high = arr[arr.length - 1];
        low = 1;

        binarySearch();
    }
}
