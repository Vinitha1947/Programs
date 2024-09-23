import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("The sum of digits of the number is: " + sum);
        sc.close();
    }
    public static int sumOfDigits(int number){
        int sum = 0;
        number = Math.abs(number);
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
