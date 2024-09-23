import java.util.Scanner;
public class KthIndexOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        System.out.print("Enter the index (a number): ");
        int k = sc.nextInt();
        char result = getKthIndex(inputString, k);
        if(result != '\0'){
            System.out.println("The character at index " + k + " ia: " + result);
        } else {
            System.out.println("Invalid index. Please enter a valid index within the string range.");
        }
        sc.close();
    }
    public static char getKthIndex(String str, int k){
        if(k >= 0 && k < str.length()){
            return str.charAt(k);
        } else {
            return '\0';
        }
    }
}
