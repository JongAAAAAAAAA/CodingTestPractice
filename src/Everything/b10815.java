package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * boj 10815 : 숫자 카드
 * Binary Search
 */

public class b10815 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, m, num;
    static int low, high, mid;
    static int[] arr, arr2, ans;

    static boolean binarySearch(int num) {
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > num) {
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        arr2 = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        ans = new int[m];

        for (int i = 0; i < m; i++) {
            low = 0;
            high = n - 1;
            num = arr2[i];
            binarySearch(num);
            if (binarySearch(num)) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}