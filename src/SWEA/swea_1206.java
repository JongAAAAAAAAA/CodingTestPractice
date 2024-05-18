package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class swea_1206 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int t, n;
    static ArrayList<Integer> arrayList;

    public static void main(String[] args) throws IOException {
//        t = Integer.parseInt(br.readLine());
        t = 10;

        for (int T = 1; T <= t; T++) {
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }

            System.out.println("#" + T + " " + view(arrayList));
        }
    }

    static int view(ArrayList<Integer> arrayList) {
        int n = arrayList.size();
        int available = 0;

        for (int i = 2; i < n - 2; i++) {
            int m = arrayList.get(i);
            int l1 = arrayList.get(i - 2);
            int l2 = arrayList.get(i - 1);
            int r1 = arrayList.get(i + 1);
            int r2 = arrayList.get(i + 2);

            int lMax = Math.max(l1, l2);
            int rMax = Math.max(r1, r2);
            int max = Math.max(lMax, rMax);

//            if (m > l1 && m > l2 && m > r1 && m > r2) {
            if (m > max) {
                available += (m - max);
            }
        }

        return available;
    }
}
