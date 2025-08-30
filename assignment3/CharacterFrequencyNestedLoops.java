import java.util.Scanner;

public class CharacterFrequencyNestedLoops {
    
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < text.length(); j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }
        
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }
        
        String[] result = new String[uniqueCount];
        int index = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + frequency[i];
                index++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.nextLine();
        
        String[] frequency = findCharacterFrequency(text);
        
        System.out.println("Original string: " + text);
        System.out.println("\nCharacter Frequency:");
        System.out.println("Character : Frequency");
        System.out.println("---------   ---------");
        
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i]);
        }
    }
}
