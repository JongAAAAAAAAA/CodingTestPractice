import java.util.Scanner;

public class b2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int T = scanner.nextInt();

        M = M + T;

        if (M > 59) {
            int R = M / 60;
            M -= R * 60;
            H += R;

            if (H > 23) {
                H %= 24;
            }
        }

        System.out.println(H + " " + M);

    }
}
