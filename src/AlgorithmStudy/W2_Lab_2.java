package AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class W2_Lab_2 {
    static void Memory(int[] book1, int[] book2) {
        for (int i = 0; i < book2.length; i++) {
            if (Arrays.asList(book1).contains(book2[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] book1;
    static int[] book2;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int j = 0; j < T; j++) {

            int N = Integer.parseInt(br.readLine());
            book1 = new int[N];
            st = new StringTokenizer(br.readLine()," ");

            for (int i = 0; i < N; i++) {
                book1[i] = Integer.parseInt(st.nextToken());
            }

            int M = Integer.parseInt(br.readLine());
            book2 = new int[M];
            st = new StringTokenizer(br.readLine()," ");

            for (int i = 0; i < M; i++) {
                book2[i] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println("Arrays.toString(book2) = " + Arrays.toString(book2));
        System.out.println("Arrays.toString(book1) = " + Arrays.toString(book1));

        Memory(book1, book2);
    }
}
