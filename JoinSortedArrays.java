import java.util.Arrays;
public class JoinSortedArrays {
    public static void main(String[] args) {
        int[] ascendingArray = {1, 3, 5, 7, 9};
        int[] descendingArray = {8, 6, 4, 2, 0};
        int[] joinedArray = joinSortedArrays(ascendingArray, descendingArray);
        System.out.println("Joined sorted array: " + Arrays.toString(joinedArray));
    }

    public static int[] joinSortedArrays(int[] ascendingArray, int[] descendingArray) {
        int[] joinedArray = new int[ascendingArray.length + descendingArray.length];

        // Copy elements from the ascending array to the beginning of the joined array
        System.arraycopy(ascendingArray, 0, joinedArray, 0, ascendingArray.length);

        // Copy elements from the descending array in reverse order to the end of the joined array
        int index = ascendingArray.length;
        for (int i = descendingArray.length - 1; i >= 0; i--) {
            joinedArray[index++] = descendingArray[i];
        }

        // Sort the entire joined array
        Arrays.sort(joinedArray);

        return joinedArray;
    }
}
