import java.util.Scanner;

public class SubstringComparison {
    
    public static String createSubstringWithCharAt(String text, int start, int end) {
        if (start < 0 || end > text.length() || start > end) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
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
        String text = input.next();
        
        System.out.println("Enter start index:");
        int startIndex = input.nextInt();
        
        System.out.println("Enter end index:");
        int endIndex = input.nextInt();
        
        String charAtSubstring = createSubstringWithCharAt(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);
        
        boolean areEqual = compareStringsWithCharAt(charAtSubstring, builtInSubstring);
        
        System.out.println("Original string: " + text);
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Substrings are equal: " + areEqual);
    }
}
