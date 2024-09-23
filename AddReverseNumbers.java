import java.util.Arrays;
public class AddReverseNumbers {
    public static void main(String[] args) {
        int[] num1 = {4, 3, 2};
        int[] num2 = {9, 9, 9};
        int[] result = addReverseNumbers(num1, num2);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] addReverseNumbers(int[] num1, int[] num2) {
        int n = Math.max(num1.length, num2.length);
        int[] result = new int[n + 1]; // Result array may have one extra digit for carry-over
        int carry = 0;

        for (int i = 0; i < n; i++) {
            // Add digits from both numbers and carry-over
            int sum = carry;
            if (i < num1.length) sum += num1[i];
            if (i < num2.length) sum += num2[i];

            // Update result and carry-over
            result[i] = sum % 10;
            carry = sum / 10;
        }

        // Handle any remaining carry-over
        if (carry > 0) {
            result[n] = carry;
        } else {
            // If there is no carry-over, resize the result array
            result = Arrays.copyOf(result, n);
        }

        return result;
    }
}
