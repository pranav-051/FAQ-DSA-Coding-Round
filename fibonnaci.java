// Fibonnaci series is a sequence of sum of 2 preciding numbers. 
public class fibonnaci {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void r_fib(int n) {
        int n1 = 1, n2 = 1;
        System.out.print("Without recursive approach: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ");

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.print("Fibonacci Series : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }

        System.out.println();
        r_fib(n);
    }
}
