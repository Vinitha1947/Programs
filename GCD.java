public class GCD {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int num1, int num2) {
        // Euclidean algorithm to find GCD
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
