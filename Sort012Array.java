import java.util.Arrays;
public class Sort012Array {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 1, 0, 2, 1, 2, 0};
        sort012(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void sort012(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // Swap nums[low] and nums[mid], increment both low and mid
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    // No need to swap, just move mid pointer
                    mid++;
                    break;
                case 2:
                    // Swap nums[mid] and nums[high], decrement high
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }
    }
}
