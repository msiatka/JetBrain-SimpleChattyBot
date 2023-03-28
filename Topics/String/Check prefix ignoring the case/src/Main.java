import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print((input.charAt(0) == 'j' || input.charAt(0) == 'J')? true:false);
    }
}
