import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of three points:");
        System.out.print("Point 1 (x1 y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Point 2 (x2 y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Point 3 (x3 y3): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        String triangleType = findTriangleType(x1, y1, x2, y2, x3, y3);
        System.out.println("The triangle formed by the given points is " + triangleType);

        scanner.close();
    }

    public static String findTriangleType(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate lengths of sides
        double side1 = calculateDistance(x1, y1, x2, y2);
        double side2 = calculateDistance(x2, y2, x3, y3);
        double side3 = calculateDistance(x3, y3, x1, y1);

        // Check for equilateral triangle (all sides equal)
        if (side1 == side2 && side2 == side3) {
            return "equilateral";
        }

        // Check for isosceles triangle (two sides equal)
        if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "isosceles";
        }

        // Check for right-angled triangle (using Pythagorean theorem)
        if (isRightAngled(side1, side2, side3)) {
            return "right-angled";
        }

        // If none of the above conditions are met, it's a scalene triangle
        return "scalene";
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static boolean isRightAngled(double side1, double side2, double side3) {
        // Sort side lengths
        double[] sides = {side1, side2, side3};
        java.util.Arrays.sort(sides);

        // Check if the sum of squares of two shorter sides equals the square of the longest side
        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }
}
