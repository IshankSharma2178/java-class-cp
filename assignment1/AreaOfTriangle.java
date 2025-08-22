import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaInches2 = 0.5 * base * height;
        double areaCm2 = areaInches2 * 6.4516;
        System.out.println("The area of a triangle in square inches is " + areaInches2 + " and square centimeters is " + areaCm2);
        input.close();
    }
}


