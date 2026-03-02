import java.util.Scanner;

public class Trim {
    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;
            }
        }
        return new int[] { start, end };
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        int[] indices = getTrimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println("\nCustom Trimmed Text: '" + trimmedCustom + "'");
        System.out.println("Built-in Trimmed Text: '" + trimmedBuiltIn + "'");

        boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Are both trimmed results same? " + isSame);
        sc.close();
    }
}