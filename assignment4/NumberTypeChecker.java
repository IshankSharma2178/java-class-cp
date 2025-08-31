import java.util.Scanner;

public class NumberTypeChecker {
    
    public static int checkNumberType(int number) {
        if (number < 0) {
            return -1; // negative
        } else if (number > 0) {
            return 1;  // positive
        } else {
            return 0;  // zero
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Number Type Checker");
        System.out.println("-------------------");
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int result = checkNumberType(number);
        
        System.out.println("\nResult:");
        System.out.println("Number: " + number);
        
        switch (result) {
            case -1:
                System.out.println("The number is negative");
                break;
            case 0:
                System.out.println("The number is zero");
                break;
            case 1:
                System.out.println("The number is positive");
                break;
        }
        
        input.close();
    }
}
