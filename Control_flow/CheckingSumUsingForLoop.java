import java.util.Scanner;

public class CheckingSumUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = sc.nextInt();

        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using loop: " + loopSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (loopSum == formulaSum) {
            System.out.println("Both sum are equal");
        } else {
            System.out.println("Both sum are not equal");
        }

    }
}
