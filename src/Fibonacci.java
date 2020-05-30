public class Fibonacci {

    /**
     * Generates the nth Fibonacci term recursively
     *
     * @param N nth term to calculate to.
     * @return  nth Fibonacci term.
     */
    public static int Fib(int N) {
        if (N <= 1) {
            return N;
        }
        return Fib(N-1) + Fib(N-2);

    }
    public static void main(String[] args) {
        System.out.println(Fib(35));
    }
}

