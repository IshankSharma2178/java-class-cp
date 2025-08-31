public class FootballTeamHeight {
    
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate 3-digit random heights in range 150-250 cm
            heights[i] = 150 + (int)(Math.random() * 101);
        }
        return heights;
    }
    
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    
    public static double meanHeight(int[] heights) {
        int sum = sumOfHeights(heights);
        return (double) sum / heights.length;
    }
    
    public static int shortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    
    public static int tallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
    
    public static void main(String[] args) {
        System.out.println("Football Team Height Analysis");
        System.out.println("=============================");
        
        int teamSize = 11;
        int[] heights = generateRandomHeights(teamSize);
        
        System.out.println("Player heights (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        
        System.out.println("\nHeight Statistics:");
        System.out.println("Shortest height: " + shortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + tallestHeight(heights) + " cm");
        System.out.println("Mean height: " + String.format("%.2f", meanHeight(heights)) + " cm");
        System.out.println("Sum of all heights: " + sumOfHeights(heights) + " cm");
    }
}
