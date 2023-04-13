package AlgorithmStudy;

import java.util.Arrays;
import java.util.Scanner;

public class W1_HW_2 {
    public static void S(int[] A, int[] B) {
        int total = 0;

        int max = 0;

        Arrays.sort(A);

        int[] maxArr = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                if (B[j] > max) {
                    max = B[j];
                    maxArr[i] = max;
                }
            }
            for (int k = 0; k < A.length; k++) {
                if (B[k] == max) {
                    B[k] -= max;
                    max = 0;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            total += A[i] * maxArr[i];
        }
//이게 맞나 다시생각해보자
        System.out.println(total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = scanner.nextInt();
        }

        S(A, B);
    }
}
