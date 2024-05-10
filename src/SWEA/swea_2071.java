package SWEA;

import java.io.*;
import java.util.*;

class swea_2071
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int T, avg;
    static double sum;
    public static void main(String args[]) throws Exception
    {
        T = Integer.parseInt(br.readLine());

        for(int i =0; i<T; i++){
            sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<10; j++){
                sum += Integer.parseInt(st.nextToken());
            }
            avg = (int) Math.round(sum/10);
            System.out.println("#"+(i+1)+" "+avg);
        }
    }
}