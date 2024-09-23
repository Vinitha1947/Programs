public class NthFibonacci {
    public static void main(String[] args) {
        int n = 10; // Change n to generate a different Fibonacci number
        int fibonacciNumber = generateFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
    }

    public static int generateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input. n must be greater than zero.");
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int prev = 1;
        int curr = 1;

        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
