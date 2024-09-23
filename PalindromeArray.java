import java.util.Scanner;
public class PalindromeArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        boolean isPalindrome = checkPalindrome(arr);
        if(isPalindrome){
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
        sc.close();
    }
    public static boolean checkPalindrome(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
