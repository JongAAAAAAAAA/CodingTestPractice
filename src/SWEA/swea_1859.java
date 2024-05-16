package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class swea_1859 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n;
    static ArrayList<Integer> arrayList;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }
            System.out.println("#" + T + " " + calculator(arrayList));
        }
    }

    static long calculator(ArrayList<Integer> arrayList) {
        int size = arrayList.size();
        int maxIndex = 0;
        int minIndex = 0;
        long price = 0;

        for (int i = 0; i < size; i = minIndex) {
            int max = 0;
            for (int j = i; j < size; j++) {
                if (arrayList.get(j) >= max) { // max, maxIndex 찾기
                    max = arrayList.get(j);
                    maxIndex = j;
                }
            }

            for (int j = minIndex; j < maxIndex; j++) {
                price += max - arrayList.get(j);
            }

            minIndex = maxIndex + 1;
        }
        return price;
    }
}
