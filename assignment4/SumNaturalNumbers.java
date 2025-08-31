import java.util.Scanner;

public class SumNaturalNumbers {
    
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sum of Natural Numbers Calculator");
        System.out.println("---------------------------------");
        
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = sumNaturalNumbers(n);
            System.out.println("\nResult:");
            System.out.println("Sum of first " + n + " natural numbers: " + sum);
        }
        
        input.close();
    }
}
