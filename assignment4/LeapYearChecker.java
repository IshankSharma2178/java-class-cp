import java.util.Scanner;

public class LeapYearChecker {
    
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; // Gregorian calendar started in 1582
        }
        
        // Leap year is divisible by 4 and not divisible by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Leap Year Checker");
        System.out.println("-----------------");
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        if (year < 1582) {
            System.out.println("Year " + year + " is not a Leap Year");
            System.out.println("Note: Gregorian calendar started in 1582");
        } else {
            boolean isLeap = isLeapYear(year);
            
            if (isLeap) {
                System.out.println("Year " + year + " is a Leap Year");
            } else {
                System.out.println("Year " + year + " is not a Leap Year");
            }
        }
        
        input.close();
    }
}
