import java.util.Scanner;

public class CheckingSumUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        int loopSum = 0;
        int i = 1;
        while (i <= n) {
            loopSum += i;
            i++;
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
