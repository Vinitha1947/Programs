public class SmallestLargest {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 8, 15, 7};
        int[] result = findSmallestAndLargest(array);

        System.out.println("Smallest element in the array: " + result[0]);
        System.out.println("Largest element in the array: " + result[1]);
    }

    public static int[] findSmallestAndLargest(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int smallest = array[0];
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            } else if (array[i] > largest) {
                largest = array[i];
            }
        }

        int[] result = {smallest, largest};
        return result;
    }
}
