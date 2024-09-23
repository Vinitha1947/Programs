import java.util.HashMap;
import java.util.Map;
public class MostFrequentCharacter {
    public static void main(String[] args){
        char[] charArray = {'a', 'b', 'c', 'a', 'b', 'c', 'a', 'a', 'b'};
        char mostFrequentChar = findMostFrequentChar(charArray);
        System.out.println("Most frequent character: " + mostFrequentChar);
    }
    public static char findMostFrequentChar(char[] charArray){
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(char ch : charArray){
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        char mostFrequentChar = '\0';
        int maxCount = 0;
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() > maxCount){
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequentChar;
    }
}
