package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_1954 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, n, x, y, cnt, trying;
    static int[][] arr;
    static boolean[][] boolArr;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            boolArr = new boolean[n][n];
            x = y = trying = 0;
            cnt = 1;

            while (!isTrue(boolArr)) {
                trying++;

                for (; x < n; x++) { //오른쪽으로 이동
                    if (!boolArr[y][x]) { // 들른 적 없는 곳이라면.
                        boolArr[y][x] = true;
                        arr[y][x] = cnt;
                        cnt++;
                    }
                }
                x--;

                for (; y < n; y++) { // 아래쪽으로 이동
                    if (!boolArr[y][x]) { // 들른 적 없는 곳이라면.
                        boolArr[y][x] = true;
                        arr[y][x] = cnt;
                        cnt++;
                    }
                }
                y--;

                for (; x >= 0; x--) { // 왼쪽으로 이동
                    if (!boolArr[y][x]) { // 들른 적 없는 곳이라면.
                        boolArr[y][x] = true;
                        arr[y][x] = cnt;
                        cnt++;
                    }
                }
                x++;

                for (; y >= 0; y--) { // 위쪽으로 이동
                    if (!boolArr[y][x]) { // 들른 적 없는 곳이라면.
                        boolArr[y][x] = true;
                        arr[y][x] = cnt;
                        cnt++;
                    }
                }
                y++;

                x += trying;
                y += trying;
                n--;
            }
            System.out.println("#" + i);
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    static boolean isTrue(boolean[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
