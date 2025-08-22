import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int originalNumber = number;
        
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit;
            originalNumber = originalNumber / 10;
        }
        
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        input.close();
    }
}
