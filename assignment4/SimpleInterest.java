import java.util.Scanner;

public class SimpleInterest {
    
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Simple Interest Calculator");
        System.out.println("-------------------------");
        
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter Rate of Interest (%): ");
        double rate = input.nextDouble();
        
        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();
        
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        
        System.out.println("\nResults:");
        System.out.println("The Simple Interest is " + simpleInterest + 
                          " for Principal " + principal + 
                          ", Rate of Interest " + rate + "% and Time " + time + " years");
        
        input.close();
    }
}
