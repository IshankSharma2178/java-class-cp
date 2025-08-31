import java.util.Scanner;

public class NumberAnalyzer {
    
    public static boolean isPositive(int number) {
        return number > 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Number Analyzer");
        System.out.println("===============");
        
        int[] numbers = new int[5];
        
        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        System.out.println("\nAnalysis Results:");
        System.out.println("Number\tPositive\tEven/Odd");
        System.out.println("------\t--------\t---------");
        
        // Analyze each number
        for (int i = 0; i < 5; i++) {
            String positiveStatus = isPositive(numbers[i]) ? "Yes" : "No";
            String evenOddStatus = isEven(numbers[i]) ? "Even" : "Odd";
            
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + "\t" + positiveStatus + "\t\t" + evenOddStatus);
            } else {
                System.out.println(numbers[i] + "\t" + positiveStatus + "\t\tNegative");
            }
        }
        
        // Compare first and last elements
        int comparison = compare(numbers[0], numbers[4]);
        System.out.println("\nFirst and Last Element Comparison:");
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[4]);
        
        switch (comparison) {
            case 1:
                System.out.println("First element is greater than last element");
                break;
            case -1:
                System.out.println("First element is less than last element");
                break;
            case 0:
                System.out.println("First and last elements are equal");
                break;
        }
        
        input.close();
    }
}
