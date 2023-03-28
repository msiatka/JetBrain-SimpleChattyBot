import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (x != 0) {
            System.out.println(x % 2 == 0 ? "even" : "odd");
            x = scanner.nextInt();
        }
    }
}
