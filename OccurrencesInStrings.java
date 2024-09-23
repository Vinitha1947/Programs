import java.util.HashMap;
import java.util.Map;
public class OccurrencesInStrings {
    public static void main(String[] args) {
        String str1 = "ravi";
        String str2 = "venkat";
        Map<Character, StringBuilder> occurrences = findOccurrencesInStrings(str1, str2);
        System.out.println("Occurrences in Strings:");
        for (Map.Entry<Character, StringBuilder> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, StringBuilder> findOccurrencesInStrings(String str1, String str2) {
        Map<Character, StringBuilder> occurrences = new HashMap<>();

        // Process characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!occurrences.containsKey(ch)) {
                occurrences.put(ch, new StringBuilder());
            }
            occurrences.get(ch).append(i + 1).append(", ");
        }

        // Process characters in the second string
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (!occurrences.containsKey(ch)) {
                occurrences.put(ch, new StringBuilder());
            }
            occurrences.get(ch).append(i + 1).append(", ");
        }

        return occurrences;
    }
}
