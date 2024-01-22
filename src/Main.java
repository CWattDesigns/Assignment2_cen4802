public class Main {
    /**
     * calculateFibonacci
     * Parameters: n
     * Returns: n or value if n is greated than 1
     * Description: Calculates the value at the nth Fibonacci Sequence
     */
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    /**
     * Main
     * Parameters: args
     * Returns: no return value because void
     * Description: Takes in the n, which represents the nth sequence for Fibonacci Sequence, then calculates the
     * value a that sequence. Prints the output.
     */
    public static void main(String[] args) {
        int n = 10;
        int nthTerm = calculateFibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}