public class OTPGenerator {
    
    public static int generate6DigitOTP() {
        // Generate 6-digit random number (100000 to 999999)
        return 100000 + (int)(Math.random() * 900000);
    }
    
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Found duplicate
                }
            }
        }
        return true; // All OTPs are unique
    }
    
    public static void main(String[] args) {
        System.out.println("6-Digit OTP Generator and Validator");
        System.out.println("==================================");
        
        int[] otps = new int[10];
        
        System.out.println("Generating 10 OTP numbers...");
        
        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generate6DigitOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        
        System.out.println("\nValidating uniqueness...");
        boolean areUnique = areOTPsUnique(otps);
        
        if (areUnique) {
            System.out.println("All 10 OTPs are unique!");
        } else {
            System.out.println("Duplicate OTPs found. Not all OTPs are unique.");
        }
        
        // Display all OTPs for verification
        System.out.println("\nAll generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
    }
}
