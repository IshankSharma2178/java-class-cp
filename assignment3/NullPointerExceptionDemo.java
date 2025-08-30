public class NullPointerExceptionDemo {
    
    public static void generateNullPointerException() {
        String text = null;
        System.out.println("Attempting to call length() on null string...");
        int length = text.length();
        System.out.println("Length: " + length);
    }
    
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println("Attempting to call length() on null string...");
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            System.out.println("The string is null, cannot call methods on it.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Demonstrating NullPointerException ===");
        System.out.println("First, calling method that generates exception:");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nNow calling method that handles the exception:");
        handleNullPointerException();
    }
}
