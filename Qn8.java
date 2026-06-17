import java.util.*;

public class Qn8 {
    public static void main(String[] args) {
        // Example 1
        String[] dict1 = { "cat", "flag", "green", "country", "w3resource" };
        System.out.println("Example 1:");
        System.out.println("Dictionary: " + Arrays.toString(dict1));
        System.out.println("Longest words: " + findLongestWords(dict1));
        
        // Example 2
        String[] dict2 = { "cat", "dog", "red", "is", "am" };
        System.out.println("\nExample 2:");
        System.out.println("Dictionary: " + Arrays.toString(dict2));
        System.out.println("Longest words: " + findLongestWords(dict2));
    }
    
    public static List<String> findLongestWords(String[] dictionary) {
        List<String> result = new ArrayList<>();
        
        if (dictionary == null || dictionary.length == 0) {
            return result;
        }
        
        int maxLength = 0;
        
        // Find the maximum length
        for (String word : dictionary) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        
        // Add all words with maximum length to result
        for (String word : dictionary) {
            if (word.length() == maxLength) {
                result.add(word);
            }
        }
        
        return result;
    }
}
