
import java.util.Scanner;

public class IllegalArgument {
    public static void generateException(String input) {
        String result = input.substring(5, 2);
        System.out.println("Substring result: " + result);
    }

    public static void handleException(String input) {
        try {
            String result = input.substring(5, 2);
            System.out.println("Substring result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        try {
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e.getMessage());
        }
        handleException(userInput);
    }
}
