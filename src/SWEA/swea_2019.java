package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class swea_2019 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    public static void main(String args[]) throws Exception
    {
        n = Integer.parseInt(br.readLine());

        for(int i=0; i<=n; i++){
            System.out.print((int)Math.pow(2, i)+" ");
        }
    }
}