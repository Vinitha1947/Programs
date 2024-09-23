import java.util.Arrays;
public class MeanMedianAndStandardDeviation {
    public static void main(String[] args){
        int[] arr = {5, 8, 3, 12, 9, 6, 7};
        int n = arr.length;
        double mean = findMean(arr, n);
        System.out.println("Mean: " + mean);
        double median = findMedian(arr);
        System.out.println("Median: " + median);
        double standardDeviation = findStandardDeviation(arr, mean, n);
        System.out.println("Standard Deviation: " + standardDeviation);
        double variance = Math.pow(standardDeviation, 2);
        System.out.println("Variance: " + variance);
    }
    public static double findMean(int[] arr, int n){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return (double) sum / n;
    }
    public static double findMedian(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        if(n % 2 == 0){
            return(arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }
    public static double findStandardDeviation(int[] arr, double mean, int n){
        double sumSquaredDiff = 0;
        for(int num : arr){
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiff / n);
    }
}
