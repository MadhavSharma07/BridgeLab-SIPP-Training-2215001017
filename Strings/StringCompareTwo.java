
import java.util.Scanner;

public class StringCompareTwo {
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = scanner.next();
        System.out.print("Enter second string: ");
        String second = scanner.next();
        boolean charAtComparison = compareUsingCharAt(first, second);
        boolean equalsComparison = first.equals(second);
        System.out.println("\nComparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + equalsComparison);

        if (charAtComparison == equalsComparison) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
        scanner.close();
    }
}
