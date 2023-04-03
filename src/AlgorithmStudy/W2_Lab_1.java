package AlgorithmStudy;

import java.util.Arrays;
import java.util.Scanner;

public class W2_Lab_1 {
    static void binarySearch(long[] arr, int M) {
        int lines = M; // 만들어야하는 줄 개수
        long[] bsArr = arr; // 입력한 정렬된 배열

        long low = 1; // 최소 줄 길이
        long high = bsArr[arr.length - 1]; // 최대 줄 길이

        while (high >= low) {
            int cnt = 0;

            long mid = (high + low) / 2;

            for (int i = 0; i < arr.length; i++) {
                cnt += arr[i] / mid;
            }

            if (lines > cnt) {
                high = mid -1 ;
            } else
                low = mid + 1;
        }

        System.out.println((high + low) / 2);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 원래 가지고있는 줄 개수
        int M = scanner.nextInt(); // 만드려는 줄 개수

        long arr[] = new long[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        binarySearch(arr, M);
    }
}
