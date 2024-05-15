package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class swea_1984 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, sum, avg;
    static ArrayList<Integer> arrayList;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            arrayList = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum = avg = 0;
            for (int i = 0; i < 10; i++) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arrayList);

            for (int i = 1; i < 9; i++) {
                sum += arrayList.get(i);
            }
            avg = (int) Math.round(sum / 8.0);

            System.out.println("#" + T + " " + avg);
        }
    }
}
