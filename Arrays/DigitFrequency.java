import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        String input = sc.nextLine();

        if (!input.matches("\\d+")) {
            System.out.println("Error: Please enter a valid natural number.");
            return;
        }
        int[] frequency = new int[10];
        for (char digit : input.toCharArray()) {
            frequency[digit - '0']++;
        }
        System.out.println("Frequency of each digit in the number:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Digit " + i + ": " + frequency[i]);
        }
    }
}