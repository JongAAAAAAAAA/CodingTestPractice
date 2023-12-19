package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * boj 1541 : 잃어버린 괄호
 * Greedy Algorithm
 */

public class b1541 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int sum, min = Integer.MAX_VALUE;

    static int greedy(int n, StringTokenizer st) {
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
            sum = 0;
            while (st2.hasMoreTokens()) {
                sum += Integer.parseInt(st2.nextToken());
            }
            if (min == Integer.MAX_VALUE) {
                min = sum;
            } else {
                min -= sum;
            }
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int countTokens = st.countTokens();

        System.out.println(greedy(countTokens, st));
    }
}
