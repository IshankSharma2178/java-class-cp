import java.util.Scanner;

public class UniqueCharacters {
    
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
    
    public static char[] findUniqueCharacters(String text) {
        int length = findStringLength(text);
        char[] allChars = new char[length];
        int uniqueCount = 0;
        
        for (int i = 0; i < length; i++) {
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
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(text);
        
        System.out.println("Original string: " + text);
        System.out.println("Unique characters: " + String.valueOf(uniqueChars));
        System.out.println("Number of unique characters: " + uniqueChars.length);
        
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
