public class TwoLargestArrays {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 15, 7};
        int[] largestValues = findTwoLargestValues(array);

        System.out.println("The two largest values in the array are: " + largestValues[0] + " and " + largestValues[1]);
    }

    public static int[] findTwoLargestValues(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] > secondLargest && array[i] != firstLargest) {
                secondLargest = array[i];
            }
        }

        int[] result = {firstLargest, secondLargest};
        return result;
    }
}
