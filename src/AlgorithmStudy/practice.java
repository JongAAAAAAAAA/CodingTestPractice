package AlgorithmStudy;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    static void BinarySearch(int target) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,13,14,156,15};
        Arrays.sort(arr);
        int cnt = 0;
        int low = 0;
        int high = arr.length - 1;

        System.out.println("target = " + target);

        while (high >= low) {
            cnt++;

            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                System.out.println("Found Target");
                break;
            } else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.println("cnt = " + cnt);
    }

    static void gachonMemory() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] book1 = new int[N];
        int[] book2 = new int[M];


        for (int j = 0; j < T; j++) {

            for (int i = 0; i < N; i++) {
                book1[i] = scanner.nextInt();
            }

            for (int i = 0; i < M; i++) {
                book2[i] = scanner.nextInt();
            }
        }
        if (Arrays.asList(book1).contains(book2)) {
            System.out.println(1);

        } else {
            System.out.println(0);
        }
//        for (int i = 0; i < M; i++) {
//            for (int j = 0; j < M; j++) {
//                if (Arrays.asList(book1).contains(book2)) {
//                    System.out.println(1);
//
//                } else {
//                    System.out.println(0);
//
//                }
//            }
//        }

    }

    public static void main(String[] args) {
        BinarySearch(15);
//        gachonMemory();
    }

}
