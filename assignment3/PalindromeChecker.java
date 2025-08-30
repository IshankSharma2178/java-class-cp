import java.util.Scanner;

public class PalindromeChecker {
    
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        
        return isPalindromeLogic2(text, start + 1, end - 1);
    }
    
    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }
        return reverse;
    }
    
    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);
        
        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.nextLine();
        
        boolean result1 = isPalindromeLogic1(text);
        boolean result2 = isPalindromeLogic2(text, 0, text.length() - 1);
        boolean result3 = isPalindromeLogic3(text);
        
        System.out.println("Original string: " + text);
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Two-pointer): " + result1);
        System.out.println("Logic 2 (Recursive): " + result2);
        System.out.println("Logic 3 (Reverse comparison): " + result3);
        
        if (result1 && result2 && result3) {
            System.out.println("\nThe string is a palindrome!");
        } else {
            System.out.println("\nThe string is not a palindrome.");
        }
    }
}
