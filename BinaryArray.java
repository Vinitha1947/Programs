import java.util.Scanner;
public class BinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array (0s and 1s only):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sortBinaryArray(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static void sortBinaryArray(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}
