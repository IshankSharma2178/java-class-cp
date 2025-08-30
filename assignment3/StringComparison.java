import java.util.Scanner;

public class StringComparison {
    
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
        
        System.out.println("Enter first string:");
        String firstString = input.next();
        
        System.out.println("Enter second string:");
        String secondString = input.next();
        
        boolean charAtResult = compareStringsWithCharAt(firstString, secondString);
        boolean equalsResult = firstString.equals(secondString);
        
        System.out.println("Result using charAt() method: " + charAtResult);
        System.out.println("Result using equals() method: " + equalsResult);
        System.out.println("Results match: " + (charAtResult == equalsResult));
    }
}
