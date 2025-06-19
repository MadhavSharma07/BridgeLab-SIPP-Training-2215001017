
import java.util.Scanner;

public class NumberFormat {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (or invalid text to cause exception): ");
        String input = scanner.nextLine();
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception in generateException(): " + e.getMessage());
        }
        handleException(input);

    }
}
