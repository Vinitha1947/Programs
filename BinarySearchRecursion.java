public class BinarySearchRecursion {
    public static void main(String[] args){
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int index = binarySearch(arr, target, 0, arr.length - 1);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    public static int binarySearch(int[] arr, int target, int left, int right){
        if(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                return binarySearch(arr, target, mid + 1, right);
            }
            return binarySearch(arr, target, left, mid - 1);
        }
        return -1;
    }
}
