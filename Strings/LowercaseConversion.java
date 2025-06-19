
import java.util.Scanner;

public class LowercaseConversion {
    public static String convertToLowercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        String manualLower = convertToLowercase(input);
        String builtInLower = input.toLowerCase();
        boolean isSame = compareUsingCharAt(manualLower, builtInLower);

        System.out.println("\nManual Lowercase Conversion: " + manualLower);
        System.out.println("Built-in Lowercase Conversion: " + builtInLower);
        System.out.println("Are both conversions equal? " + isSame);
        scanner.close();
    }
}
