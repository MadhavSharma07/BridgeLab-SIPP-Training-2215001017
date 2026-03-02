import java.util.*;

public class SubstringCompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String text = sc.next();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        String manualSubstring = createSubstringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("Manual Substring using charAt(): " + manualSubstring);
        System.out.println("Built-in Substring using substring(): " + builtInSubstring);

        boolean areEqual = compareUsingCharAt(manualSubstring, builtInSubstring);
        System.out.println("Are both substrings equal? " + areEqual);
    }

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
