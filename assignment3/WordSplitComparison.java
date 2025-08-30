import java.util.Scanner;

public class WordSplitComparison {
    
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    
    public static String[] splitTextIntoWords(String text) {
        int length = findStringLength(text);
        int wordCount = 0;
        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;
        
        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIndex = 0;
        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex] = i;
                spaceIndex++;
            }
        }
        
        String[] words = new String[wordCount];
        int startIndex = 0;
        
        for (int i = 0; i < wordCount; i++) {
            int endIndex = (i < spaceIndexes.length) ? spaceIndexes[i] : length;
            StringBuilder word = new StringBuilder();
            for (int j = startIndex; j < endIndex; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
            startIndex = endIndex + 1;
        }
        
        return words;
    }
    
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a text:");
        String text = input.nextLine();
        
        String[] userDefinedWords = splitTextIntoWords(text);
        String[] builtInWords = text.split(" ");
        
        boolean areEqual = compareStringArrays(userDefinedWords, builtInWords);
        
        System.out.println("Original text: " + text);
        System.out.println("User-defined words count: " + userDefinedWords.length);
        System.out.println("Built-in words count: " + builtInWords.length);
        System.out.println("Results match: " + areEqual);
        
        System.out.print("User-defined words: ");
        for (String word : userDefinedWords) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();
        
        System.out.print("Built-in words: ");
        for (String word : builtInWords) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();
    }
}
