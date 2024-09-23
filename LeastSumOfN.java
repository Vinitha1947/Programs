import java.util.Arrays;
public class LeastSumOfN {
    public static void main(String[] args){
        int[] nums = {4, 2, 1, 3};
        int n = 2; // Change this value to adjust the number of elements to sum
        int leastSum = findLeastSumOfN(nums, n);
        System.out.println("Least sum of any " + n + " numbers: " + leastSum);
    }

    public static int findLeastSumOfN(int[] nums, int n){
        // Sort the array
        Arrays.sort(nums);

        // The least sum will be the sum of the first 'n' elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
