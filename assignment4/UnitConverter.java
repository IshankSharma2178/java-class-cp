public class UnitConverter {
    
    // Distance conversions
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    
    // Temperature conversions
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    // Weight conversions
    public static double convertPoundsToKg(double pounds) {
        double pounds2kg = 0.453592;
        return pounds * pounds2kg;
    }
    
    public static double convertKgToPounds(double kg) {
        double kg2pounds = 2.20462;
        return kg * kg2pounds;
    }
    
    // Volume conversions
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    
    public static void main(String[] args) {
        System.out.println("Unit Converter Utility Class Demo");
        System.out.println("=================================");
        
        // Test distance conversions
        System.out.println("\nDistance Conversions:");
        System.out.println("10 km = " + String.format("%.2f", convertKmToMiles(10)) + " miles");
        System.out.println("5 miles = " + String.format("%.2f", convertMilesToKm(5)) + " km");
        System.out.println("100 meters = " + String.format("%.2f", convertMetersToFeet(100)) + " feet");
        System.out.println("50 feet = " + String.format("%.2f", convertFeetToMeters(50)) + " meters");
        System.out.println("3 yards = " + String.format("%.2f", convertYardsToFeet(3)) + " feet");
        System.out.println("12 feet = " + String.format("%.2f", convertFeetToYards(12)) + " yards");
        System.out.println("2 meters = " + String.format("%.2f", convertMetersToInches(2)) + " inches");
        System.out.println("24 inches = " + String.format("%.2f", convertInchesToMeters(24)) + " meters");
        System.out.println("10 inches = " + String.format("%.2f", convertInchesToCm(10)) + " cm");
        
        // Test temperature conversions
        System.out.println("\nTemperature Conversions:");
        System.out.println("32°F = " + String.format("%.2f", convertFahrenheitToCelsius(32)) + "°C");
        System.out.println("100°C = " + String.format("%.2f", convertCelsiusToFahrenheit(100)) + "°F");
        
        // Test weight conversions
        System.out.println("\nWeight Conversions:");
        System.out.println("10 pounds = " + String.format("%.2f", convertPoundsToKg(10)) + " kg");
        System.out.println("5 kg = " + String.format("%.2f", convertKgToPounds(5)) + " pounds");
        
        // Test volume conversions
        System.out.println("\nVolume Conversions:");
        System.out.println("5 gallons = " + String.format("%.2f", convertGallonsToLiters(5)) + " liters");
        System.out.println("10 liters = " + String.format("%.2f", convertLitersToGallons(10)) + " gallons");
    }
}
