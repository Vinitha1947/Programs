public class ReverseArray {
    public static void main(String[] args){
        int[] intArr = {1, 2, 3, 4, 5};
        char[] charArr = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Original integer array:");
        printArray(intArr);
        System.out.println("Reversed integer array:");
        printArray(reverseArray(intArr));
        System.out.println("Original character array:");
        printArray(charArr);
        System.out.println("Reversed character array:");
        printArray(reverseArray(charArr));
    }
    public static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] reversedArr = new int[n];
        for(int i = 0; i < n; i++){
            reversedArr[i] = arr[n - i - 1];
        }
        return reversedArr;
    }
    public static char[] reverseArray(char[] arr){
        int n = arr.length;
        char[] reversedArr = new char[n];
        for(int i = 0; i < n; i++){
            reversedArr[i] = arr[n - i - 1];
        }
        return reversedArr;
    }
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.println(num + " ");
        }
        System.out.println();
    }
    public static void printArray(char[] arr){
        for(char ch : arr){
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
