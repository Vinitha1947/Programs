import java.util.HashSet;
public class CommonCharacters {
    public static void main(String[] args){
        String str1 = "aabc";
        String str2 = "aaba";
        String commonChars = findCommonCharacters(str1, str2);
        System.out.println("Common characters: " + commonChars);
    }
    public static String findCommonCharacters(String str1, String str2){
        HashSet<Character> set = new HashSet<>();
        for(char ch : str1.toCharArray()){
            if(str2.indexOf(ch) != -1){
                set.add(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char ch : set){
            result.append(ch);
        }
        return result.toString();
    }
}
