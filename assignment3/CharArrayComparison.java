import java.util.Scanner;

public class CharArrayComparison {
    
    public static char[] getCharactersFromString(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
    
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
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
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.next();
        
        char[] userDefinedArray = getCharactersFromString(text);
        char[] builtInArray = text.toCharArray();
        
        boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);
        
        System.out.println("Original string: " + text);
        System.out.println("User-defined array length: " + userDefinedArray.length);
        System.out.println("Built-in array length: " + builtInArray.length);
        System.out.println("Arrays are equal: " + areEqual);
        
        System.out.print("User-defined array: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        System.out.print("Built-in array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
