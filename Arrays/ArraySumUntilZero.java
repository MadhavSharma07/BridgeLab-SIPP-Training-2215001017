import java.util.*;

public class ArraySumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0.0;
        int idx = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0 || idx == 10) {
                break;
            }

            numbers[idx] = num;
            idx++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < idx; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }

        System.out.println("Total sum: " + sum);
    }
}
