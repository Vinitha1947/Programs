import java.util.Scanner;
public class IntegerToString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        String strNumber = integerToString(number);
        System.out.println("Integer converted to string: " + strNumber);
        sc.close();
    }
    public static String integerToString(int number){
        return "" + number;
    }
}
