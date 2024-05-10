package SWEA;

import java.io.*;
import java.util.*;

class swea_1933 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String args[]) throws Exception {
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}