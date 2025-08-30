import java.util.Scanner;

public class NumberFormatExceptionDemo {
    
    public static void generateNumberFormatException(String text) {
        System.out.println("Attempting to parse '" + text + "' as integer...");
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }
    
    public static void handleNumberFormatException(String text) {
        try {
            System.out.println("Attempting to parse '" + text + "' as integer...");
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
            System.out.println("The text '" + text + "' cannot be converted to an integer.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string (that is not a number):");
        String text = input.next();
        
        System.out.println("=== Demonstrating NumberFormatException ===");
        
        System.out.println("\nFirst, calling method that generates exception:");
        try {
            generateNumberFormatException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nNow calling method that handles the exception:");
        handleNumberFormatException(text);
    }
}
