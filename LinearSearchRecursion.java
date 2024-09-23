public class LinearSearchRecursion {
    public static void main(String[] args){
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int index = linearSearch(arr, target, 0);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    public static int linearSearch(int[] arr, int target, int index){
        if(index < arr.length){
            if(arr[index] == target){
                return index;
            } else {
                return linearSearch(arr, target, index + 1);
            }
        }
        return -1;
    }
}
