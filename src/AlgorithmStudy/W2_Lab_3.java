package AlgorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class W2_Lab_3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] arr;

    static void BS() { // 선이 꼬이는 개수를 기준으로 잡는다.
        int high = arr.length - 1; // 최대로 많이 꼬일 수 있는 경우는 (반대편 전봇대 개수 - 1) 개
        int low = 0; // 최소로 꼬일 수 있는 경우는 0 개
        int cnt = 0; // 꼬인 횟수 ? but, 꼬인 횟수를 단순히 계산하는 것은 의미가 있지 않음.
        int remove = 0;
        // 어떻게 꼬였는지가 중요.

        //꼬인 상태를 정의해줘야함.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1])
                cnt++; // 꼬임수 증가
        }
        if (cnt== arr.length-1){
            remove = 1;
        }

        ///


//        for (int i=0; i< arr.length; i++){
//            for (int j=i+1; j< arr.length; j++ ){
//                if (arr[i] > arr[j])
//                    cnt++;
//            }
//        }


    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        BS();
    }
}
