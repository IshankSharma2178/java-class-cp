import java.util.Scanner;

public class FirstNumberSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        boolean isFirstSmallest = number1 < number2 && number1 < number3;
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        input.close();
    }
}
