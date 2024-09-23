import java.util.Arrays;
public class LeftRotation {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        int rotations = 3;
        int[] rotatedArray = leftRotate(arr, rotations);
        System.out.println("Array after " + rotations + " left rotations: " + Arrays.toString(rotatedArray));
    }
    public static int[] leftRotate(int[] arr, int rotations){
        if(arr == null || arr.length == 0 || rotations <= 0){
            return arr;
        }
        rotations %= arr.length;
        reverse(arr, 0, rotations - 1);
        reverse(arr, rotations, arr.length -1);
        reverse(arr, 0, arr.length - 1);
        return arr;
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
