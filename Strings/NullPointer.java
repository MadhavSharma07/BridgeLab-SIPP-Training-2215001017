import java.util.Scanner;

public class NullPointer {
    public static void generateException(String text) {
        int length = text.length(); 
        System.out.println("Length of the string: " + length);
    }
    public static void handleException(String text) {
        try {
            int length = text.length(); 
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (type 'null' to simulate NullPointerException): ");
        String input = scanner.nextLine();
        String userInput = input.equalsIgnoreCase("null") ? null : input;

        try {
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception in generateException(): " + e.getMessage());
        }
        handleException(userInput);
        scanner.close();
    }
}