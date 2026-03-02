import java.util.Scanner;

public class UppercaseConversion {
    public static String convertToUppercase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); 
            }
            result += ch;
        }

        return result;
    }
    public static boolean compareUsingFunction(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        String manualUpper = convertToUppercase(input);
        String builtInUpper = input.toUpperCase();
        boolean isSame = compareUsingFunction(manualUpper, builtInUpper);

        System.out.println("\nManual Uppercase Conversion: " + manualUpper);
        System.out.println("Built-in Uppercase Conversion: " + builtInUpper);
        System.out.println("Are both conversions equal? " + isSame);
    }
}