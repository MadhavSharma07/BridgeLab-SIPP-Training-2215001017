import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[(n / 2) + 1];
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                arr[i] = i;
            }
        }
        System.out.println("The factors of " + n + " are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
