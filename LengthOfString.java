import java.util.Scanner;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int length = getStringLength(inputString);
        System.out.println("The length of the string is: " + length);
        sc.close();
    }
    public static int getStringLength(String str) {
        return str.length();
    }
}
