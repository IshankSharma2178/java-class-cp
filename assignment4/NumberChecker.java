import java.util.Scanner;

public class NumberChecker {
    
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
    
    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    
    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true; // Has non-zero digit
            }
        }
        return false;
    }
    
    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        
        int sum = 0;
        int power = digits.length;
        
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        
        return sum == number;
    }
    
    // Method to find the largest and second largest elements
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        
        return new int[]{largest, secondLargest};
    }
    
    // Method to find the smallest and second smallest elements
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        
        return new int[]{smallest, secondSmallest};
    }
    
    // Method to find the sum of the digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    
    // Method to find the sum of the squares of the digits
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    
    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }
    
    // Method to find the frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {
        int[] frequency = new int[10];
        
        for (int digit : digits) {
            frequency[digit]++;
        }
        
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }
        
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i; // digit
                result[index][1] = frequency[i]; // frequency
                index++;
            }
        }
        
        return result;
    }
    
    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    
    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        
        int square = number * number;
        int sumOfDigits = 0;
        
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        return sumOfDigits == number;
    }
    
    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int[] digits) {
        int sum = 0;
        int product = 1;
        
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        
        return sum == product;
    }
    
    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        
        long square = (long) number * number;
        String squareStr = String.valueOf(square);
        String numberStr = String.valueOf(number);
        
        return squareStr.endsWith(numberStr);
    }
    
    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        
        return number % 7 == 0 || number % 10 == 7;
    }
    
    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum == number;
    }
    
    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        if (number <= 1) {
            return false;
        }
        
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum > number;
    }
    
    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        if (number <= 1) {
            return false;
        }
        
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum < number;
    }
    
    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int[] digits) {
        int number = 0;
        for (int digit : digits) {
            number = number * 10 + digit;
        }
        
        int sum = 0;
        for (int digit : digits) {
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
        }
        
        return sum == number;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Number Checker Utility Class Demo");
        System.out.println("=================================");
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int[] digits = storeDigits(number);
        
        System.out.println("\nNumber Analysis for: " + number);
        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        System.out.println("\nNumber Properties:");
        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrongNumber(digits));
        System.out.println("Harshad Number: " + isHarshadNumber(digits));
        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Prime Number: " + isPrime(number));
        System.out.println("Neon Number: " + isNeonNumber(digits));
        System.out.println("Spy Number: " + isSpyNumber(digits));
        System.out.println("Automorphic Number: " + isAutomorphicNumber(digits));
        System.out.println("Buzz Number: " + isBuzzNumber(digits));
        System.out.println("Perfect Number: " + isPerfectNumber(number));
        System.out.println("Abundant Number: " + isAbundantNumber(number));
        System.out.println("Deficient Number: " + isDeficientNumber(number));
        System.out.println("Strong Number: " + isStrongNumber(digits));
        
        int[] largestPair = findLargestAndSecondLargest(digits);
        int[] smallestPair = findSmallestAndSecondSmallest(digits);
        
        System.out.println("\nDigit Statistics:");
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + String.format("%.2f", sumOfSquaresOfDigits(digits)));
        System.out.println("Largest digit: " + largestPair[0]);
        System.out.println("Second largest digit: " + largestPair[1]);
        System.out.println("Smallest digit: " + smallestPair[0]);
        System.out.println("Second smallest digit: " + smallestPair[1]);
        
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("\nDigit Frequency:");
        for (int[] freq : frequency) {
            System.out.println("Digit " + freq[0] + " appears " + freq[1] + " times");
        }
        
        input.close();
    }
}
