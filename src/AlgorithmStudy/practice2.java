package AlgorithmStudy;

import java.util.Random;

public class practice2 {
    public static void main(String[] args) {
        int[] dValue = new int[9];


        for (int i=0; i<9; i++){
            dValue[i] = new Random().nextInt(100);
            System.out.println("dValue = " + dValue[i]);
        }
    }

}
