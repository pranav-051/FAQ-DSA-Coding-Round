
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

    }
}
