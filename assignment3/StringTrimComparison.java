import java.util.Scanner;

public class StringTrimComparison {
    
    public static int[] findTrimIndexes(String text) {
        int startIndex = 0;
        int endIndex = text.length() - 1;
        
        while (startIndex < text.length() && text.charAt(startIndex) == ' ') {
            startIndex++;
        }
        
        while (endIndex >= 0 && text.charAt(endIndex) == ' ') {
            endIndex--;
        }
        
        return new int[]{startIndex, endIndex + 1};
    }
    
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
        
        System.out.println("Enter a string with leading/trailing spaces:");
        String text = input.nextLine();
        
        int[] trimIndexes = findTrimIndexes(text);
        String userDefinedTrimmed = createSubstringWithCharAt(text, trimIndexes[0], trimIndexes[1]);
        String builtInTrimmed = text.trim();
        
        boolean areEqual = compareStringsWithCharAt(userDefinedTrimmed, builtInTrimmed);
        
        System.out.println("Original string: [" + text + "]");
        System.out.println("User-defined trimmed: [" + userDefinedTrimmed + "]");
        System.out.println("Built-in trimmed: [" + builtInTrimmed + "]");
        System.out.println("Results match: " + areEqual);
    }
}
