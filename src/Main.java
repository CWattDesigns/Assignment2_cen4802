public class Main {
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int nthTerm = calculateFibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}