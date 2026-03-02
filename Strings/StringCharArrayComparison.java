
import java.util.Scanner;

public class StringCharArrayComparison {
    public static char[] getCharsManually(String text) {
        int length = text.length();
        char[] characters = new char[length];
        for (int i = 0; i < length; i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        char[] manualChars = getCharsManually(input);
        char[] builtInChars = input.toCharArray();

        boolean isSame = compareCharArrays(manualChars, builtInChars);

        System.out.print("\nManual Character Array: ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }
        System.out.print("\nBuilt-in Character Array: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println("\n\nAre both character arrays equal? " + isSame);
        scanner.close();
    }
}
