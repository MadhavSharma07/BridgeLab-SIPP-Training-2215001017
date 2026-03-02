
import java.util.*;

public class FootballTeamStats {
    public static int[] generateHeights(int count) {
        int[] heights = new int[count];
        for (int i = 0; i < count; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); 
        }
        return heights;
    }
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }
    public static void displayHeights(int[] heights) {
        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm\n", calculateMean(heights));
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        displayHeights(heights);
    }
}
