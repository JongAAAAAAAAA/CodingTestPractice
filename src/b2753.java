import java.util.Scanner;

public class b2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        if (i % 4 == 0) {
            if (i % 100 != 0 || i % 400 == 0)
                System.out.println("1");
            else
                System.out.println("0");
        } else
            System.out.println("0");
    }
}
