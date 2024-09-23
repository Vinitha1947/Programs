public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        double median = findMedian(arr1, arr2);
        System.out.println("Median of the combined sorted array: " + median);
    }

    public static double findMedian(int[] arr1, int[] arr2) {
        int totalLength = arr1.length + arr2.length;
        int[] mergedArray = new int[totalLength];

        int i = 0, j = 0, k = 0;

        // Merge both arrays into a single sorted array
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Add remaining elements from arr1, if any
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Add remaining elements from arr2, if any
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        // Calculate median
        if (totalLength % 2 == 0) {
            // If the total number of elements is even
            int mid = totalLength / 2;
            return (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
        } else {
            // If the total number of elements is odd
            int mid = totalLength / 2;
            return mergedArray[mid];
        }
    }
}
