import java.util.Scanner;

public class b25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int l = n / 4;

        for (int i = 0; i < l; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
