import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int xmin = scanner.nextInt();
        int xmax = scanner.nextInt();
        System.out.print(str.substring(xmin, xmax + 1));
    }
}
