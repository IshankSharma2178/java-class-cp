import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            int sumFormula = number * (number + 1) / 2;
            int sumWhile = 0;
            int i = 1;
            while (i <= number) {
                sumWhile += i;
                i++;
            }
            boolean isCorrect = sumFormula == sumWhile;
            System.out.println("Formula result: " + sumFormula);
            System.out.println("While loop result: " + sumWhile);
            System.out.println("Both results are correct: " + isCorrect);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        input.close();
    }
}
