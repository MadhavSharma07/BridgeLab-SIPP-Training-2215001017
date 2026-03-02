import java.util.*;

public class GreatestFactorUsingwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int greatestFactor = 1;
        int counter = num - 1;

        while (counter >= 1) {
            if (num % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("The greatest factor of " + num + " (besides itself) is: " + greatestFactor);
    }
}
