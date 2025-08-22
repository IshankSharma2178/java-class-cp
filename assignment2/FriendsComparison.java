import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();
        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();
        
        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        double tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        
        System.out.println("Youngest friend age: " + youngestAge);
        System.out.println("Tallest friend height: " + tallestHeight);
        input.close();
    }
}
