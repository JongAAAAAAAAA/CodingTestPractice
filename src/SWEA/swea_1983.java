package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.StringTokenizer;

public class swea_1983 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, k, midExam, finalExam, assignment, score, realRank;
    static Integer[] arr, arr2;
    static String[] rank = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            arr = new Integer[n];
            arr2 = new Integer[n];
            k = Integer.parseInt(st.nextToken());

            for (int i = 0; i < n; i++) { // 점수 입력
                st = new StringTokenizer(br.readLine());
                midExam = Integer.parseInt(st.nextToken());
                finalExam = Integer.parseInt(st.nextToken());
                assignment = Integer.parseInt(st.nextToken());

                score = totalScore(midExam, finalExam, assignment);

                arr[i] = score;
                arr2[i] = score;
            }
            Arrays.sort(arr2);
            Collections.reverse(Arrays.asList(arr2));

            realRank = 0;
            for (int i = 0; i < n; i++) {
                if (Objects.equals(arr2[i], arr[k - 1])) {
                    realRank = i;
                }
            }
            System.out.println("#" + T + " " + rank[realRank / (n / 10)]);
        }
    }

    static int totalScore(int midExam, int finalExam, int assignment) {
        return (midExam * 35 + finalExam * 45 + assignment * 20);
    }
}
