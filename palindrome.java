
import java.util.Scanner;

class palindrome {

    private static boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1 = s1.reverse();

        StringBuilder s2 = new StringBuilder();
        s2.append(s);

        return s1.toString().equals(s2.toString());
    }

    private static boolean is_palindrome(String s) {
        int n = s.length();
        int L = 0, R = n - 1;

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(L) != s.charAt(R)) {
                return false;
            }
            R--;
            L++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine();
        scan.close();

        System.out.println("Is palindrome? (Using built-in method) " + isPalindrome(s));

        System.out.println("Is palindrome? (Using two-pointer method) " + is_palindrome(s));
    }
}
