public class CountGreaterLesser {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 5, 6};
        int target = 5;
        countGreaterAndLesser(nums, target);
    }

    public static void countGreaterAndLesser(int[] nums, int target){
        int greaterCount = 0;
        int lesserCount = 0;

        // Iterate through the array
        for(int num : nums){
            if(num > target){
                greaterCount++;
            } else if(num < target){
                lesserCount++;
            }
        }

        System.out.println("Greater: " + greaterCount + " and Lesser: " + lesserCount);
    }
}
