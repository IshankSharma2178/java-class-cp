import java.util.Scanner;

public class ToLowerCaseComparison {
    
    public static String convertToLowerCaseWithCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                result.append((char)(currentChar + 32));
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
    
    public static boolean compareStringsWithCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.nextLine();
        
        String userDefinedLower = convertToLowerCaseWithCharAt(text);
        String builtInLower = text.toLowerCase();
        
        boolean areEqual = compareStringsWithCharAt(userDefinedLower, builtInLower);
        
        System.out.println("Original string: " + text);
        System.out.println("Lowercase using charAt(): " + userDefinedLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Results are equal: " + areEqual);
    }
}
