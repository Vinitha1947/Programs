public class RemoveElementsInRange {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 2;
        int j = 7;
        int[] result = removeElementsInRange(arr, i, j);
        System.out.println("Array after removing elements from index " + i + "to index " + j + ":");
        for(int num : result){
            System.out.println(num + " ");
        }
    }
    public static int[] removeElementsInRange(int[] arr, int i, int j){
        if(arr == null || arr.length == 0 || i < 0 || j >= arr.length || i > j){
            return arr;
        }
        int newSize = arr.length - (j - i + 1);
        int[] newArr = new int[newSize];
        System.arraycopy(arr, 0, newArr, 0, i);
        System.arraycopy(arr, j + 1, newArr, i, arr.length - j -1);
        return newArr;
    }
}
