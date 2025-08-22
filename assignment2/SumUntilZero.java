import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double userValue;
        while (true) {
            userValue = input.nextDouble();
            if (userValue == 0) {
                break;
            }
            total += userValue;
        }
        System.out.println(total);
        input.close();
    }
}
