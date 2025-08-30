import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    
    public static void generateIllegalArgumentException(String text) {
        int startIndex = 5;
        int endIndex = 2;
        System.out.println("Attempting to create substring from index " + startIndex + " to " + endIndex + "...");
        String substring = text.substring(startIndex, endIndex);
        System.out.println("Substring: " + substring);
    }
    
    public static void handleIllegalArgumentException(String text) {
        try {
            int startIndex = 5;
            int endIndex = 2;
            System.out.println("Attempting to create substring from index " + startIndex + " to " + endIndex + "...");
            String substring = text.substring(startIndex, endIndex);
            System.out.println("Substring: " + substring);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
            System.out.println("Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.next();
        
        System.out.println("=== Demonstrating IllegalArgumentException ===");
        System.out.println("String: " + text + " (length: " + text.length() + ")");
        
        System.out.println("\nFirst, calling method that generates exception:");
        try {
            generateIllegalArgumentException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nNow calling method that handles the exception:");
        handleIllegalArgumentException(text);
    }
}
