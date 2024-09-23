import java.util.Scanner;
public class KthIndexFromEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        System.out.print("Enter the index from the end (a number): ");
        int k = sc.nextInt();
        char result = getKthIndexFromEnd(inputString, k);
        if(result != '\0'){
            System.out.println("The character at index " + k + "from the end is: " + result);
        } else {
            System.out.println("Invalid index. Please enter a valid index within the string range.");
        }
        sc.close();
    }
    public static char getKthIndexFromEnd(String str, int k){
        if(k >= 0 && k < str.length()){
            return str.charAt(str.length() - k - 1);
        } else {
            return '\0';
        }
    }
}
