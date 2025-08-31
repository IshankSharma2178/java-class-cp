import java.util.Scanner;

public class FactorsCalculator {
    
    public static int[] findFactors(int number) {
        // First loop to count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        // Second loop to store factors in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        
        return factors;
    }
    
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Factors Calculator");
        System.out.println("------------------");
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int[] factors = findFactors(number);
            
            System.out.println("\nResults for number: " + number);
            System.out.println("Factors: ");
            for (int i = 0; i < factors.length; i++) {
                System.out.print(factors[i]);
                if (i < factors.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            
            System.out.println("Number of factors: " + factors.length);
            System.out.println("Sum of factors: " + sumOfFactors(factors));
            System.out.println("Sum of squares of factors: " + String.format("%.2f", sumOfSquaresOfFactors(factors)));
            System.out.println("Product of factors: " + productOfFactors(factors));
        }
        
        input.close();
    }
}
