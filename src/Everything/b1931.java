package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * boj 1931 : 회의실 배정
 * Greedy Algorithm
 */

public class b1931 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, cnt = 1, secondNumber;
    static int[][] arr;

    static int greedy(int n, int[][] arr) {
        secondNumber = arr[0][1];

        for (int i = 1; i < n; i++) {
            if (secondNumber <= arr[i][0]) {
                secondNumber = arr[i][1];
//                System.out.println("secondNumber = " + secondNumber);
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> (o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]));

//        System.out.println("arr = " + Arrays.deepToString(arr));

        System.out.println(greedy(n, arr));
    }
}
