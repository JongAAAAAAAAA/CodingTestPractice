package AlgorithmStudy;

import java.util.Arrays;
import java.util.Scanner;


public class W1_HW_1 {
    static String s;

    public static void main(String[] args) {

//        long answer = -1;

        long answer = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        System.out.println("s = " + s);
        char[] arr = s.toCharArray();
        System.out.println("arr = " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    answer += (j - i);
                } else {
//                    j++;
                    if (j - i > 1) {
                        int k = j - i - 1;
                        answer += k;
//                        for (int h = 1; h < arr.length - 2; h++) {
//                            if (arr[j] == arr[h]) {
//                                count++;
//                                answer -= count;
//                                count = 0;
//                            }
//                        }
                    }
                }
            }
            System.out.println("answer = " + answer);
        }
        System.out.println("answer1 = " + answer);
    }
}
