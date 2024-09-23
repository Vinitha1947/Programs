import java.util.Scanner;
public class FirstWordOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        String firstWord = getFirstWord(inputString);
        System.out.println("The first word of the string is: " + firstWord);
        sc.close();
    }
    public static String getFirstWord(String str){
        str = str.trim();
        int spaceIndex = str.indexOf(' ');
        if(spaceIndex == -1){
            return str;
        }
        return str.substring(0,spaceIndex);
    }
}
