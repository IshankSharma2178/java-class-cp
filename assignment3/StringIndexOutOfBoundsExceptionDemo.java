import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    
    public static void generateStringIndexOutOfBoundsException(String text) {
        System.out.println("Attempting to access character at index " + text.length() + "...");
        char character = text.charAt(text.length());
        System.out.println("Character: " + character);
    }
    
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            System.out.println("Attempting to access character at index " + text.length() + "...");
            char character = text.charAt(text.length());
            System.out.println("Character: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
            System.out.println("Cannot access index " + text.length() + " in a string of length " + text.length());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.next();
        
        System.out.println("=== Demonstrating StringIndexOutOfBoundsException ===");
        System.out.println("String: " + text + " (length: " + text.length() + ")");
        
        System.out.println("\nFirst, calling method that generates exception:");
        try {
            generateStringIndexOutOfBoundsException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nNow calling method that handles the exception:");
        handleStringIndexOutOfBoundsException(text);
    }
}
