package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1940 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, distance, velocity, tokenCounts;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            n = Integer.parseInt(br.readLine());

            velocity = distance = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                tokenCounts = st.countTokens();
                arr = new int[tokenCounts];
                for (int k = 0; k < tokenCounts; k++) {
                    arr[k] = Integer.parseInt(st.nextToken());
                }
                if (arr[0] == 1) {
                    velocity += arr[1];
                    distance += velocity;
                } else if (arr[0] == 2) {
                    if (velocity < arr[1]) {
                        velocity = 0;
                    } else {
                        velocity -= arr[1];
                        distance += velocity;
                    }
                } else {
                    distance += velocity;
                }
            }
            System.out.println("#" + i + " " + distance);
        }
    }
}
