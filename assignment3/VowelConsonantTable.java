import java.util.Scanner;

public class VowelConsonantTable {
    
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    
    public static String[][] createCharacterTypeArray(String text) {
        String[][] result = new String[text.length()][2];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        
        return result;
    }
    
    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        System.out.println("---------\t----");
        
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.nextLine();
        
        String[][] characterTypes = createCharacterTypeArray(text);
        
        System.out.println("String: " + text);
        System.out.println("\nCharacter Type Analysis:");
        displayTable(characterTypes);
    }
}
