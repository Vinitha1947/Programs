import java.util.Scanner;
public class SubstringFromTo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        System.out.print("Enter index i: ");
        int i = sc.nextInt();
        System.out.print("Enter index j: ");
        int j = sc.nextInt();
        String substring = getSubstring(inputString, i, j);
        System.out.println("The substring from index " + i + "to index " + " is: " + substring);
        sc.close();
    }
    public static String getSubstring(String str, int i, int j){
        if(i < 0 || i >= str.length() || j < 0 || j >= str.length() || i > j){
            return "Invalid indices";
        }
        return str.substring(i, j + 1);
    }
}
