import java.util.*;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= num;
            counter++;
        }

        System.out.println(num + " raised to the power of " + power + " is: " + result);

    }
}