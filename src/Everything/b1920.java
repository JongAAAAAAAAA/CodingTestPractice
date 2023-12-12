package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * boj 1920 : 수 찾기
 * Binary Search
 */

public class b1920 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m, num;
    static int low, mid, high;
    static int[] arr, arr2;

    static int binarySearch(int num) {
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > num) {
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());

        arr2 = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            low = 0;
            high = n - 1;

            num = arr2[i];

            System.out.println(binarySearch(num));
        }
    }
}
