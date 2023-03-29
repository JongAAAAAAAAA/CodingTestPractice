package AlgorithmStudy;

import java.util.Arrays;
import java.util.Scanner;

public class W2_Lab_1 {
    static void binarySearch(int[] arr, int M) {
        int lines = M; // 만들어야하는 줄 개수
        int[] bsArr = arr; // 입력한 정렬된 배열

        int low = 1; // 최소 줄 길이
        int high = bsArr[arr.length - 1]; // 최대 줄 길이

        while (high >= low) {
            int cnt = 0;

            int mid = (high + low) / 2;

            for (int i = 0; i < arr.length; i++) {
                cnt += arr[i] / mid;
            }

            if (lines > cnt) {
                high = mid;
            } else
                low = mid + 1;
        }

        System.out.println("low = " + low);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 원래 가지고있는 줄 개수
        int M = scanner.nextInt(); // 만드려는 줄 개수

        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        binarySearch(arr, M);
    }
}
