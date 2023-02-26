import java.util.Scanner;

public class b2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int C1 = A * (B%100%10);
        int C2 = A * (B/10%10);
        int C3 = A * (B/100);
        int D = C1 + C2*10 + C3*100;

        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println(D);
    }
}
