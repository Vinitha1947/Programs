import java.util.Arrays;
public class LeastSumOfTwo {
    public static void main(String[] args){
        int[] nums = {4, 2, 1, 3};
        int leastSum = findLeastSumOfTwo(nums);
        System.out.println("Least sum of any two numbers: " + leastSum);
    }

    public static int findLeastSumOfTwo(int[] nums){
        // Sort the array
        Arrays.sort(nums);

        // The least sum will be the sum of the first two elements
        return nums[0] + nums[1];
    }
}
