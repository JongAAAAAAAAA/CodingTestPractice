package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * boj 2003
 * <p>
 * 구간의 합이 M이 되는 경우의 수(cnt)를 구해야함.
 */

/**
 * 테스트 케이스 N <= 10,000 이고, 0.5 초의 시간 제한을 갖는다. O(N^2) == O(1억) 으로 풀 경우 1 초의 시간이 걸리므로 완전 탐색으로 풀어서는 안 된다. 즉 투포인터인 O(N)으로
 * 풀어야 한다.
 */

public class b2003 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int l = 0; // 포인터 L
        int r = 0; // 포인터 R
        int sum = 0;
        int cnt = 0;

        while (true) {
            if (sum >= m) {
                sum -= arr[l++];
            } else if (r == n) {
                break;
            } else {
                sum += arr[r++];
            }

            if (sum == m) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
