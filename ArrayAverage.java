import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        double[] averages = computeAverages(arr);
        System.out.println("Average of positive numbers: " + averages[0]);
        System.out.println("Average of negative numbers: " + averages[1]);
        System.out.println("Average of all numbers: " + averages[2]);
        scanner.close();
    }
    public static double[] computeAverages(int[] arr) {
        double positiveSum = 0;
        int positiveCount = 0;
        double negativeSum = 0;
        int negativeCount = 0;
        double totalSum = 0;
        int totalCount = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveSum += num;
                positiveCount++;
            } else if (num < 0) {
                negativeSum += num;
                negativeCount++;
            }
            totalSum += num;
            totalCount++;
        }
        double positiveAverage = positiveCount > 0 ? positiveSum / positiveCount : 0;
        double negativeAverage = negativeCount > 0 ? negativeSum / negativeCount : 0;
        double totalAverage = totalCount > 0 ? totalSum / totalCount : 0;
        return new double[]{positiveAverage, negativeAverage, totalAverage};
    }
}
