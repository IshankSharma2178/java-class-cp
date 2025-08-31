import java.util.Scanner;

public class SumNaturalNumbersRecursive {
    
    public static int sumNaturalNumbersRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumNaturalNumbersRecursive(n - 1);
    }
    
    public static int sumNaturalNumbersFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sum of Natural Numbers Calculator (Recursive vs Formula)");
        System.out.println("------------------------------------------------------");
        
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int recursiveResult = sumNaturalNumbersRecursive(n);
            int formulaResult = sumNaturalNumbersFormula(n);
            
            System.out.println("\nResults for first " + n + " natural numbers:");
            System.out.println("Using recursion: " + recursiveResult);
            System.out.println("Using formula n*(n+1)/2: " + formulaResult);
            System.out.println("Results match: " + (recursiveResult == formulaResult));
            
            if (recursiveResult == formulaResult) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There's an error in one of the computations.");
            }
        }
        
        input.close();
    }
}
