import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int result = A + B;
        System.out.println(result);

        result = A - B;
        System.out.println(result);

        result = A * B;
        System.out.println(result);

        result = A / B;
        System.out.println(result);

        result = A % B;
        System.out.println(result);

        scanner.close();
    }
}