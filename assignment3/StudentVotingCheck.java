import java.util.Scanner;

public class StudentVotingCheck {
    
    public static int[] generateRandomAges(int count) {
        int[] ages = new int[count];
        for (int i = 0; i < count; i++) {
            ages[i] = (int)(Math.random() * 50) + 10;
        }
        return ages;
    }
    
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        
        return result;
    }
    
    public static void displayTable(String[][] table) {
        System.out.println("Student\tAge\tCan Vote");
        System.out.println("-------\t---\t--------");
        
        for (int i = 0; i < table.length; i++) {
            String canVote = table[i][1].equals("true") ? "Yes" : "No";
            System.out.println((i + 1) + "\t" + table[i][0] + "\t" + canVote);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter ages for 10 students:");
        int[] ages = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter age for student " + (i + 1) + ":");
            ages[i] = input.nextInt();
        }
        
        String[][] votingStatus = checkVotingEligibility(ages);
        
        System.out.println("\nVoting Eligibility Table:");
        displayTable(votingStatus);
    }
}
