import java.util.Arrays;
public class FirstTwoLargest {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 15, 7};
        int[] largestNumbers = findFirstTwoLargest(array);

        System.out.println("The first two largest numbers in the array are: " + Arrays.toString(largestNumbers));
    }

    public static int[] findFirstTwoLargest(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest1) {
                largest2 = largest1;
                largest1 = num;
            } else if (num > largest2 && num != largest1) {
                largest2 = num;
            }
        }

        int[] result = {largest1, largest2};
        return result;
    }
}
