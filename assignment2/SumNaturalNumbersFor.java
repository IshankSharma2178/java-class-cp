import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            int sumFormula = number * (number + 1) / 2;
            int sumFor = 0;
            for (int i = 1; i <= number; i++) {
                sumFor += i;
            }
            boolean isCorrect = sumFormula == sumFor;
            System.out.println("Formula result: " + sumFormula);
            System.out.println("For loop result: " + sumFor);
            System.out.println("Both results are correct: " + isCorrect);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        input.close();
    }
}
