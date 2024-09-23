import java.util.Scanner;
public class NumberOfVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int[] counts = countVowelsConsonants(inputString);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
        sc.close();
    }
    public static int[] countVowelsConsonants(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        str = str.toLowerCase(); // Convert the string to lowercase to handle both uppercase and lowercase characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        return new int[] {vowelsCount, consonantsCount};
    }
}
