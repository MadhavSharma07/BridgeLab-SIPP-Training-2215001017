import java.util.*;

public class MultiplicationTableOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] table = new int[10];

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            table[i] = num * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + table[i]);
        }

    }
}
