import java.util.Scanner;
public class LastWordInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        String lastWord = getLastWord(inputString);
        System.out.println("The last word in the string is: " + lastWord);
        sc.close();
    }
    public static String getLastWord(String str){
        str = str.trim();
        int lastSpaceIndex = str.lastIndexOf(' ');
        if(lastSpaceIndex == -1){
            return str;
        }
        return str.substring(lastSpaceIndex + 1);
    }
}
