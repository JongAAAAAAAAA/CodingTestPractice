package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * boj 2470 : 두 용액
 * 배열 중 두 개의 원소의 합이 0에 가까운 두 원소를 찾아야 함.
 * 절대값을 이용하자.
 */

/**
 * 테스트 케이스 N <= 100,000 이고, 1 초의 시간 제한을 갖는다.
 * O(N^2) == O(100억) 으로 풀 경우 1 초의 시간을 넘기므로
 * 즉 투포인터인 O(N)으로 풀어야 한다.
 */

public class b2470 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int l = 0;
        int r = n-1;

        int finalResult;
        int finalL = 0;
        int finalR = 0;

        int min = Integer.MAX_VALUE;
        int sum;

        // 고도화 코드
        while (l < r) {
            sum = arr[l] + arr[r];
            finalResult = Math.abs(sum);

            if (min > finalResult) {
                min = finalResult;
                finalL = l;
                finalR = r;
            }

            if (sum == 0) {
                break;
            }

            if (sum > 0) {
                r--;
            } else {
                l++;
            }
        }

//        처음 작성한 코드
//        while (l < r) {
//            int sum = arr[l] + arr[r];
//
//            if (sum == 0) {
//                break;
//            }
//
//            if (sum > 0) {
//                r--;
//                if (l == r) {
//                    ++r;
//                    break;
//                }
//            } else {
//                l++;
//                if (l == r) {
//                    ++l;
//                    break;
//                }
//            }
//
//            int newAbs = Math.abs(arr[l] + arr[r]);
//
//            if (finalResult > newAbs) {
//                finalResult = newAbs;
//                finalL = l;
//                finalR = r;
//            }
//        }

//        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println(arr[finalL] + " " + arr[finalR]);
    }
}
