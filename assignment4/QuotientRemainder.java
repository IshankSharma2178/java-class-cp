import java.util.Scanner;

public class QuotientRemainder {
    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quotient and Remainder Calculator");
        System.out.println("---------------------------------");
        
        System.out.print("Enter dividend: ");
        int dividend = input.nextInt();
        
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();
        
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int[] result = findRemainderAndQuotient(dividend, divisor);
            
            System.out.println("\nResults:");
            System.out.println("Dividend: " + dividend);
            System.out.println("Divisor: " + divisor);
            System.out.println("Quotient: " + result[1]);
            System.out.println("Remainder: " + result[0]);
        }
        
        input.close();
    }
}
