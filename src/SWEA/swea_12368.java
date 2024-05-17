package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_12368 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, a, b;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            int time = a + b;
            int restHour = time % 24;
            int answer = 0;

            if (time < 24) {
                answer = time;
            } else if (time > 24 && restHour != 0) {
                time /= 24;
                answer = restHour + time - 1;
            }
            System.out.println("#" + T + " " + answer);
        }
    }
}
