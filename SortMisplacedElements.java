import java.util.Arrays;
public class SortMisplacedElements {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 4, 3, 5, 8, 7, 6};
        sortMisplacedElements(sortedArray);
        System.out.println("Sorted array with misplaced elements corrected: " + Arrays.toString(sortedArray));
    }

    public static void sortMisplacedElements(int[] sortedArray) {
        // Make a copy of the sorted array
        int[] sortedCopy = Arrays.copyOf(sortedArray, sortedArray.length);

        // Sort the copied array
        Arrays.sort(sortedCopy);

        // Iterate through both arrays to find misplaced elements
        for (int i = 0, j = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] != sortedCopy[j]) {
                // If the element in the original array doesn't match the sorted copy, update it
                sortedArray[i] = sortedCopy[j];
            } else {
                // If the elements match, move to the next element in the sorted copy
                j++;
            }
        }
    }
}
