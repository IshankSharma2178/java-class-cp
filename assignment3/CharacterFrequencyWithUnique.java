import java.util.Scanner;

public class CharacterFrequencyWithUnique {
    
    public static char[] findUniqueCharacters(String text) {
        char[] allChars = new char[text.length()];
        int uniqueCount = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < uniqueCount; j++) {
                if (allChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                allChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = allChars[i];
        }
        
        return uniqueChars;
    }
    
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.nextLine();
        
        String[][] frequency = findCharacterFrequency(text);
        
        System.out.println("Original string: " + text);
        System.out.println("\nCharacter Frequency:");
        System.out.println("Character\tFrequency");
        System.out.println("---------\t---------");
        
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
        }
    }
}
