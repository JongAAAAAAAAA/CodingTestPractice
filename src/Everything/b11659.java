package Everything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b11659 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] s = new int[N + 1];
        s[0] = 0;

        StringTokenizer st2 = new StringTokenizer(br.readLine());


        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            s[i] = s[i-1] + arr[i-1];
        }

//        System.out.println("\ns = " + Arrays.toString(s));
        for (int i = 0; i < M; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());

            int i1 = Integer.parseInt(st3.nextToken());
            int i2 = Integer.parseInt(st3.nextToken());

            System.out.println(s[i2] - s[i1 - 1]);
        }
    }
}
