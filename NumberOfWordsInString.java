import java.util.Scanner;
public class NumberOfWordsInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int wordCount = countWords(inputString);
        System.out.println("The number of words in the string is: " + wordCount);
        sc.close();
    }
    public static int countWords(String str){
        str = str.trim();
        if(str.isEmpty()){
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }
}
