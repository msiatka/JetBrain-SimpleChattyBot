import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long k = 0;
        long n = 0;
        double m = 0;

        Scanner scanner = new Scanner(System.in);
        k = scanner.nextLong();
        n = scanner.nextLong();
        m = scanner.nextDouble();

//        System.out.printf("K: %d N: %d M: %f \n", k,n,m);
        boolean condition = false;
        Random randomno;
        int counter = 0;
        double gaussianRandom = 0;

        while (! condition) {
            counter = 0;
//            System.out.println("licznik k: " + k);
            randomno = new Random(k);

            for (int i = 0; i < n; i++) {
                gaussianRandom = randomno.nextGaussian();
//                System.out.println("Next Gaussian value: " + gaussianRandom);
                counter += m >= gaussianRandom ? 1 : 0;
            }
            if (counter == n) {
                condition = true;
                break;
            }

            k++;
        }

        System.out.println(k);


    }
}