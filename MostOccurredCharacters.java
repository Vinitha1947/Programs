import java.util.HashMap;
import java.util.Map;
public class MostOccurredCharacters {
    public static void main(String[] args){
        String inputString = "aaabba";
        String mostOccurredChars = findMostOccurredCharacters(inputString);
        System.out.println("Most occurred character(s): " + mostOccurredChars);
    }

    public static String findMostOccurredCharacters(String inputString){
        // Create a HashMap to store character counts
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for(char ch : inputString.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find the maximum occurrence count
        int maxCount = 0;
        for (int count : charCount.values()) {
            maxCount = Math.max(maxCount, count);
        }

        // Find characters with maximum occurrence count
        StringBuilder mostOccurredChars = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue() == maxCount){
                mostOccurredChars.append(entry.getKey());
            }
        }

        return mostOccurredChars.toString();
    }
}
