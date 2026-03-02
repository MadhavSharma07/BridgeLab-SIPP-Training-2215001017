import java.util.*;

public class RemainingChocolate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] ans = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child will get " + ans[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + ans[1]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { quotient, remainder };
    }
}
