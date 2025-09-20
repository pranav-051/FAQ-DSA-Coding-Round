public class Sample {

    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean isPal(int n) {
        int original = n;
        int reverse = 0;
        
        while (n > 0) {
            int r = n % 10;
            reverse = reverse * 10 + r;

            n = n / 10;
        }

        System.out.println("Reverse: " + reverse   );

        if (original == reverse) {
            return true;
        }

        return false;
    }
    

    public static void main(String[] args) {
        int s = 221;
        
        System.out.println("Palindrome?  " + isPal(s)); 
    }
}
