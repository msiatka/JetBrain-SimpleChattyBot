import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long number = 0;
        long sum = 0;

        Random random = new Random(a+b);
        for (int i = 0; i < n; i++) {
            number = random.nextInt(b - a + 1) + a;
//            System.out.println(number);
            sum += number;
//            System.out.println(sum);
        }
        System.out.println(sum);

    }
}