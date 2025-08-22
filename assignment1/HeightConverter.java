import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightCm = input.nextDouble();
        double inches = heightCm / 2.54;
        double feet = inches / 12.0;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        input.close();
    }
}


