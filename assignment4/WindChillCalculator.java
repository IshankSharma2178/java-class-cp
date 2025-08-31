import java.util.Scanner;

public class WindChillCalculator {
    
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Wind Chill Temperature Calculator");
        System.out.println("---------------------------------");
        
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();
        
        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = input.nextDouble();
        
        if (windSpeed < 0) {
            System.out.println("Wind speed cannot be negative.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            
            System.out.println("\nResults:");
            System.out.println("Temperature: " + temperature + "°F");
            System.out.println("Wind Speed: " + windSpeed + " mph");
            System.out.println("Wind Chill Temperature: " + String.format("%.2f", windChill) + "°F");
        }
        
        input.close();
    }
}
