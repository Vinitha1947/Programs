import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Entered matrix:");
        printMatrix(matrix);
        int trace = calculateTrace(matrix);
        System.out.println("Trace of the matrix: " + trace);
        System.out.print("Enter the row index (0 to " + (m - 1) + "): ");
        int rowIndex = scanner.nextInt();
        System.out.print("Enter the column index (0 to " + (n - 1) + "): ");
        int colIndex = scanner.nextInt();
        int rowSum = calculateRowSum(matrix, rowIndex);
        int colSum = calculateColSum(matrix, colIndex);
        System.out.println("Sum of elements in the " + rowIndex + "th row: " + rowSum);
        System.out.println("Sum of elements in the " + colIndex + "th column: " + colSum);
        scanner.close();
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static int calculateTrace(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < Math.min(matrix.length, matrix[0].length); i++) {
            trace += matrix[i][i];
        }
        return trace;
    }
    public static int calculateRowSum(int[][] matrix, int rowIndex) {
        int sum = 0;
        for (int j = 0; j < matrix[rowIndex].length; j++) {
            sum += matrix[rowIndex][j];
        }
        return sum;
    }
    public static int calculateColSum(int[][] matrix, int colIndex) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][colIndex];
        }
        return sum;
    }
}
