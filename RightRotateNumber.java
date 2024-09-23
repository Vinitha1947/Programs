import java.util.Scanner;
public class RightRotateNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int rotatedNumber = rightRotateNumber(number);
        System.out.println("Right rotated number: " + rotatedNumber);
        sc.close();
    }
    public static int rightRotateNumber(int number){
        int lastDigit = number % 10;
        number /= 10;
        int numDigits = (int) Math.log10(number) + 1;
        int powerOf10 = (int) Math.pow(10, numDigits);
        int rotatedNumber = (lastDigit * powerOf10) + number;
        return rotatedNumber;
    }
}
