import java.util.*;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

    
        int[] oddArray = new int[(num/2)+1];
        int[] evenArray = new int[(num/2)];
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenArray[oddIndex++] = i;
            } else {
                oddArray[evenIndex++] = i;
            }
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
