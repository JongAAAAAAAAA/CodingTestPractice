package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * boj 10816 : 숫자 카드 2
 * Binary Search
 */

public class b10816 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int low, high, mid, ans;
    static int[] arr;

    static int lowerBound(int key) { // key 이상인 첫 인덱스(mid)를 찾으면 됨.
        low = 0;
        high = arr.length; // arr.length - 1 아닌 이유는 upperbound 에서 인덱스가 하나 더 커야하기 때문

        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] >= key) {
                high = mid; // mid - 1 안 하는 이유는 중복 값이 있을 수도 있기 때문.
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int upperBound(int key) { // key 초과인 첫 인덱스를 찾으면 됨.
        low = 0;
        high = arr.length;

        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] > key) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int binarySearch(int key) {
//        System.out.println("upperBound(key) = " + upperBound(key));
//        System.out.println("lowerBound(key) = " + lowerBound(key));
        return upperBound(key) - lowerBound(key);
    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
//        System.out.println("arr = " + Arrays.toString(arr));

        m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            ans = binarySearch(Integer.parseInt(st.nextToken()));
            sb.append(ans).append(" ");
        }

        System.out.println(sb);
    }
}