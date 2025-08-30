import java.util.Scanner;

public class WordLength2DArray {
    
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
    
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a text:");
        String text = input.nextLine();
        
        String[] words = splitTextIntoWords(text);
        String[][] wordLengthArray = createWordLengthArray(words);
        
        System.out.println("Original text: " + text);
        System.out.println("\nWord Length Table:");
        System.out.println("Word\t\tLength");
        System.out.println("----\t\t------");
        
        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(word + "\t\t" + length);
        }
    }
}
