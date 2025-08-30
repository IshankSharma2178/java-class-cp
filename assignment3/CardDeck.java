import java.util.Scanner;

public class CardDeck {
    
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        
        return deck;
    }
    
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        String[] shuffled = new String[n];
        
        for (int i = 0; i < n; i++) {
            shuffled[i] = deck[i];
        }
        
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            
            String temp = shuffled[i];
            shuffled[i] = shuffled[randomCardNumber];
            shuffled[randomCardNumber] = temp;
        }
        
        return shuffled;
    }
    
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Cannot distribute " + cardsPerPlayer + " cards to " + numPlayers + " players.");
            return null;
        }
        
        String[][] players = new String[numPlayers][cardsPerPlayer];
        
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[i * cardsPerPlayer + j];
            }
        }
        
        return players;
    }
    
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + (j + 1) + ". " + players[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] deck = initializeDeck();
        System.out.println("Deck initialized with " + deck.length + " cards.");
        
        String[] shuffledDeck = shuffleDeck(deck);
        System.out.println("Deck shuffled successfully.");
        
        System.out.println("Enter number of players:");
        int numPlayers = input.nextInt();
        
        System.out.println("Enter number of cards per player:");
        int cardsPerPlayer = input.nextInt();
        
        String[][] players = distributeCards(shuffledDeck, numPlayers, cardsPerPlayer);
        
        if (players != null) {
            System.out.println("\nDistributing " + cardsPerPlayer + " cards to " + numPlayers + " players:");
            printPlayers(players);
        }
    }
}
