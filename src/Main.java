public class Main {
    /**
     * CalculateFibonacci
     * @param n
     * @return n or result from calculation
     * Description: Given the number is greater than 1, recursively call this function to calculate the value at
     * the nth Fibonacci Sequence.
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
     * @param args
     * @return no return value
     * Description: Provides the nth sequence number, then passes that to the calculateFibonacci function.
     * It then outputs the result of that recursive function to tell the user what the value is at the nth Fibonacci
     * Sequence.
     */
    public static void main(String[] args) {
        int n = 10;
        int nthTerm = calculateFibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}