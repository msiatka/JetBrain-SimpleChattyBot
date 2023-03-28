import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int j = 0;
        int k = 1;
        for (int i = 1; i <= numb; i++) {
            j = 0;
            while (j < i) {
                System.out.printf("%d ", i);
                if (k == numb) {
                    i = numb + 1;
                    break;
                }
                j++;
                k++;

            }
            ;
        }

    }
}
