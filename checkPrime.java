
import java.util.Scanner;

public class checkPrime {

    private static void checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count > 2) {
                System.out.println("Entered Number is not prime number");
                break;
            }
        }

        if (count == 2) {
            System.out.println("Entered Number is prime number");
        }
    }

    //optimal
    private static void checkPrime_2(int n) {
        if (n <= 1) {
            System.out.println("Entered Number is not prime number");
            return;
        }
        if (n == 2) {
            System.out.println("Entered Number is prime number");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("Entered Number is not prime number");
            return;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                System.out.println("Entered Number is not prime number");
                return;
            }
        }

        System.out.println("Entered Number is prime number");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not: ");
        int n = scan.nextInt();
        checkPrime(n);
        scan.close();
    }
}
