import java.util.*;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer to find its multiplication table from 6 to 9: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Multiplication table of " + num + " from 6 to 9:");
            for (int i = 6; i <= 9; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }

    }
}