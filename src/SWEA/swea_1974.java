package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1974 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t;
    static int[][] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        for (int T = 1; T <= t; T++) {
            arr = new int[9][9];
            check = new boolean[10]; // 초기화 계속 해줘야함
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.println("#" + T + " " + verification(arr));
        }
    }

    static int verification(int[][] arr) {
        if (width(arr)&&length(arr)&&block(arr)) {
            return 1;
        } else {
            return 0;
        }
    }

    static boolean width(int[][] arr) { // 가로 검증
        for (int i = 0; i < 9; i++) { // 9줄 검증
            check = new boolean[10];
            for (int j = 0; j < 9; j++) { // 한줄 검증
                check[arr[i][j]] = true;
            }
            for (int j = 1; j <= 9; j++) {
                if (!check[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean length(int[][] arr) { // 세로 검증
        for (int i = 0; i < 9; i++) { // 9줄 검증
            check = new boolean[10];
            for (int j = 0; j < 9; j++) { // 한줄 검증
                check[arr[j][i]] = true;
            }
            for (int j = 1; j <= 9; j++) {
                if (!check[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean block(int[][] arr) { // 3x3 블록 검증
        for (int i = 0; i < 3; i++) { // 세로 3세트 검증
            check = new boolean[10];
            for (int j = 0; j < 3; j++) { // 가로 3세트 검증
                for (int k = i*3; k < i*3 + 3; k++) { // 한 세트 검증
                    for (int l = j*3; l < j*3 + 3; l++) { // 한줄 검증
                        check[arr[k][l]] = true;
                    }
                }
                for (int k = 1; k <= 9; k++) {
                    if (!check[k]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
