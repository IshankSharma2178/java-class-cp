import java.util.Scanner;

public class RockPaperScissors {
    
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "rock";
        }
    }
    
    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "tie";
        }
        
        if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
            (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "player";
        } else {
            return "computer";
        }
    }
    
    public static String[][] calculateStats(int playerWins, int computerWins, int ties, int totalGames) {
        String[][] stats = new String[3][3];
        
        double playerPercentage = (double) playerWins / totalGames * 100;
        double computerPercentage = (double) computerWins / totalGames * 100;
        double tiePercentage = (double) ties / totalGames * 100;
        
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercentage) + "%";
        
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercentage) + "%";
        
        stats[2][0] = "Ties";
        stats[2][1] = String.valueOf(ties);
        stats[2][2] = String.format("%.2f", tiePercentage) + "%";
        
        return stats;
    }
    
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("----\t------\t--------\t------");
        
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" + 
                              gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }
        
        System.out.println("\nStatistics:");
        System.out.println("Player\t\tWins\tPercentage");
        System.out.println("------\t\t----\t----------");
        
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of games to play:");
        int numGames = input.nextInt();
        
        String[][] gameResults = new String[numGames][3];
        int playerWins = 0, computerWins = 0, ties = 0;
        
        for (int i = 0; i < numGames; i++) {
            System.out.println("\nGame " + (i + 1) + ": Enter your choice (rock/paper/scissors):");
            String playerChoice = input.next().toLowerCase();
            
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);
            
            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
            
            if (winner.equals("player")) {
                playerWins++;
            } else if (winner.equals("computer")) {
                computerWins++;
            } else {
                ties++;
            }
            
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Result: " + winner);
        }
        
        String[][] stats = calculateStats(playerWins, computerWins, ties, numGames);
        displayResults(gameResults, stats);
    }
}
