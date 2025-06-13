import java.util.*;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num = 0.0;

        System.out.print("Enter a number: ");
        num = sc.nextDouble();

        while (num != 0) {
            total += num;
            System.out.print("Enter a number: ");
            num = sc.nextDouble();
        }

        System.out.println("The total sum is: " + total);
    }
}
