public class MaxMinValues {
    public static void main(String[] args){
        int[] arr = {3, 6, 2, 8, 1, 9, 5};
        int[] result = findMaxMinValues(arr);
        System.out.println("Maximum value: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
    }
    public static int[] findMaxMinValues(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return new int[]{max, min};
    }
}
