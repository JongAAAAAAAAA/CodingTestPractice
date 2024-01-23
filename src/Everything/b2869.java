package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * boj 2869 : 달팽이는 올라가고 싶다
 * 구현
 */

public class b2869 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int a, b, v, cnt;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        if ((v - b) % (a - b) == 0) {
            cnt = (v - b) / (a - b);
        } else {
            cnt = (v - b) / (a - b) + 1;
        }

        System.out.println(cnt);
    }
}
