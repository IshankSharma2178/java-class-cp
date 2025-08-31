import java.util.Scanner;

public class ChocolateDistribution {
    
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{remainingChocolates, chocolatesPerChild};
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Chocolate Distribution Calculator");
        System.out.println("---------------------------------");
        
        System.out.print("Enter number of chocolates: ");
        int chocolates = input.nextInt();
        
        System.out.print("Enter number of children: ");
        int children = input.nextInt();
        
        if (chocolates < 0 || children <= 0) {
            System.out.println("Please enter valid positive numbers.");
        } else {
            int[] result = findRemainderAndQuotient(chocolates, children);
            
            System.out.println("\nResults:");
            System.out.println("Total chocolates: " + chocolates);
            System.out.println("Number of children: " + children);
            System.out.println("Chocolates per child: " + result[1]);
            System.out.println("Remaining chocolates: " + result[0]);
        }
        
        input.close();
    }
}
