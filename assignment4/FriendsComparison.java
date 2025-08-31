import java.util.Scanner;

public class FriendsComparison {
    
    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
        }
        return youngest;
    }
    
    public static double findTallest(double[] heights) {
        double tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Friends Comparison - Youngest and Tallest");
        System.out.println("=========================================");
        
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Input data for 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter data for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            
            System.out.print("Height (in cm): ");
            heights[i] = input.nextDouble();
        }
        
        // Find youngest and tallest
        int youngestAge = findYoungest(ages);
        double tallestHeight = findTallest(heights);
        
        System.out.println("\nResults:");
        System.out.println("Youngest friend age: " + youngestAge + " years");
        System.out.println("Tallest friend height: " + tallestHeight + " cm");
        
        // Display all friends' data
        System.out.println("\nAll Friends Data:");
        System.out.println("Name\t\tAge\tHeight(cm)");
        System.out.println("----\t\t---\t---------");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + "\t\t" + ages[i] + "\t" + heights[i]);
        }
        
        input.close();
    }
}
