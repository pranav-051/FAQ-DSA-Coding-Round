
class factorial {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void r_fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        System.out.println("Factorial is " + res);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of 5 is " + fact(n));

        System.out.println();
        r_fact(n);
    }
}
