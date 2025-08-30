import java.util.Scanner;

public class ToUpperCaseComparison {
    
    public static String convertToUpperCaseWithCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                result.append((char)(currentChar - 32));
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
        
        String userDefinedUpper = convertToUpperCaseWithCharAt(text);
        String builtInUpper = text.toUpperCase();
        
        boolean areEqual = compareStringsWithCharAt(userDefinedUpper, builtInUpper);
        
        System.out.println("Original string: " + text);
        System.out.println("Uppercase using charAt(): " + userDefinedUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Results are equal: " + areEqual);
    }
}
