import java.util.Scanner;

public class StudentVoteChecker {
    
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Cannot vote if age is negative
        }
        return age >= 18; // Can vote if age is 18 or above
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Student Voting Eligibility Checker");
        System.out.println("=================================");
        
        int[] studentAges = new int[10];
        
        // Input ages for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }
        
        System.out.println("\nVoting Eligibility Results:");
        System.out.println("Student\tAge\tCan Vote");
        System.out.println("-------\t---\t--------");
        
        // Check voting eligibility for each student
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            String voteStatus = canVote ? "Yes" : "No";
            
            System.out.println((i + 1) + "\t" + studentAges[i] + "\t" + voteStatus);
        }
        
        input.close();
    }
}
