package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class swea_2029
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int t, a, b;
    //static ArrayList<Integer> arr;
    public static void main(String args[]) throws Exception
    {
        t = Integer.parseInt(br.readLine());
        for(int i = 1; i<=t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            System.out.println("#"+i+" "+(a/b)+" "+(a%b));
        }
    }
}