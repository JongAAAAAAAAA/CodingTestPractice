package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class swea_13038 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n;
    static ArrayList<Integer> arrayList;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            arrayList = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }

            System.out.println("#" + T + " " + bf(arrayList, n));
        }
    }

    static int bf(ArrayList<Integer> arrayList, int n) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            int check = 0;
            int cnt = 0;

            Integer integer = arrayList.get(i);
            if (integer == 1) { // 1로 시작하는 인덱스 찾기
                ArrayList<Integer> newArray = new ArrayList<>();
                arrayList.addAll(arrayList);

                for (int j = i; j < i + 7; j++) {
                    newArray.add(arrayList.get(j));
                }

                while (check < n) { // count 세기
                    for (int j = 0; j < 7; j++) {
                        cnt++;
                        Integer integer1 = newArray.get(j);
                        if (integer1 == 1) {
                            check++;
                            if (check == n) {
                                break;
                            }
                        }
                    }
                }

                for (int j = 0; j < 7; j++) {
                    arrayList.remove(7);
                }

                if (cnt < min) {
                    min = cnt;
                }
            }
        }

        return min;
    }
}
