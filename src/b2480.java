import java.util.Scanner;

public class b2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int price;

        if (a == b && b == c && c == a)
            price = 10000 + a * 1000;
        else if (a == b && c != a && c != b)
            price = 1000 + a * 100;
        else if (b == c && a != b && a != c)
            price = 1000 + b * 100;
        else if (c == a && b != c && b != a)
            price = 1000 + c * 100;
        else {
            int max = a;
            if (b > max)
                max = b;
            if (c > max)
                max = c;
            price = max * 100;
        }

        System.out.println(price);
    }
}
