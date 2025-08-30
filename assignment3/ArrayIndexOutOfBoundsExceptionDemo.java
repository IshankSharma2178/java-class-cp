import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        int invalidIndex = names.length;
        System.out.println("Attempting to access element at index " + invalidIndex + "...");
        String name = names[invalidIndex];
        System.out.println("Name at index " + invalidIndex + ": " + name);
    }
    
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            int invalidIndex = names.length;
            System.out.println("Attempting to access element at index " + invalidIndex + "...");
            String name = names[invalidIndex];
            System.out.println("Name at index " + invalidIndex + ": " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            System.out.println("Cannot access index " + names.length + " in an array of length " + names.length);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of names:");
        int count = input.nextInt();
        
        String[] names = new String[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = input.next();
        }
        
        System.out.println("=== Demonstrating ArrayIndexOutOfBoundsException ===");
        System.out.println("Array length: " + names.length);
        
        System.out.println("\nFirst, calling method that generates exception:");
        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        System.out.println("\nNow calling method that handles the exception:");
        handleArrayIndexOutOfBoundsException(names);
    }
}
