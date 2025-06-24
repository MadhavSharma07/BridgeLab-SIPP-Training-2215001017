
import java.util.*;

public class LargestOfthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        boolean firstLargest = (num1 >= num2) && (num1 >= num3);
        boolean secondLargest = (num2 >= num1) && (num2 >= num3);
        boolean thirdLargest = (num3 >= num1) && (num3 >= num2);

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

    }
}
