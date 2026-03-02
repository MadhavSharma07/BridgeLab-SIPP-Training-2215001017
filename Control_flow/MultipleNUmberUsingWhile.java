import java.util.*;

public class MultipleNUmberUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int num = sc.nextInt();

        if (num <= 0 || num >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            int counter = num - 1;

            System.out.println("Multiples of " + num + " below 100:");
            while (counter > 1) {
                if (counter % num == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

    }
}