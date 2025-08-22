import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("Year is not a Leap Year");
        } else if (year % 4 != 0) {
            System.out.println("Year is not a Leap Year");
        } else if (year % 100 != 0) {
            System.out.println("Year is a Leap Year");
        } else if (year % 400 != 0) {
            System.out.println("Year is not a Leap Year");
        } else {
            System.out.println("Year is a Leap Year");
        }
        input.close();
    }
}
