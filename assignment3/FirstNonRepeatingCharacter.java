import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }
        
        return '\0';
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.nextLine();
        
        char result = findFirstNonRepeatingCharacter(text);
        
        System.out.println("Original string: " + text);
        
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
