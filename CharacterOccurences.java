import java.util.HashMap;
import java.util.Map;
public class CharacterOccurences {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> occurrences = findCharacterOccurrences(str);
        System.out.println("Occurrences of each character:");
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> findCharacterOccurrences(String str) {
        Map<Character, Integer> occurrences = new HashMap<>();

        // Iterate through the string
        for (char c : str.toCharArray()) {
            // Increment the count of each character
            occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
        }

        return occurrences;
    }
}
