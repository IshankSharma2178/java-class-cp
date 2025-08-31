public class SpringSeason {
    
    public static boolean isSpringSeason(int month, int day) {
        // Spring Season is from March 20 to June 20
        if (month == 3 && day >= 20) {
            return true;
        } else if (month == 4) {
            return true;
        } else if (month == 5) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            System.out.println("Example: java SpringSeason 4 15");
            return;
        }
        
        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);
            
            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
                return;
            }
            
            if (day < 1 || day > 31) {
                System.out.println("Invalid day. Please enter a number between 1 and 31.");
                return;
            }
            
            boolean isSpring = isSpringSeason(month, day);
            
            System.out.println("Date: Month " + month + ", Day " + day);
            if (isSpring) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers for month and day.");
        }
    }
}
