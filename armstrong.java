//Arsmstrong number is  sum of product of each number multiplied by number of digits in a given number. Ex: 153 = 1^3 + 5^3 + 3^3 here 3 is number of digits in 153. Ex2: 9474 = 9^4 + 4^4 + 7^4 + 4^4 here 4 is number of digits in 9474.
import java.util.Scanner;

public class armstrong {

    private static boolean isArmstrong(int n) {
        int n1 = n;
        int sum = 0;
        while (n1 > 0) {
            int r = n1 % 10;
            sum += r * r * r;
            n1 /= 10;
        }
        System.out.println("sum: " + sum);
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scan.nextInt();

        System.out.println("Entered number is armstrong number: " + isArmstrong(n));
        scan.close();
    }
}
