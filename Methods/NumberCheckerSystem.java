

import java.util.*;

public class NumberCheckerSystem {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, product = 1, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String nStr = String.valueOf(n);
        String sqStr = String.valueOf(square);
        return sqStr.endsWith(nStr);
    }

    public static boolean isBuzz(int n) {
        return (n % 7 == 0 || n % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = sc.nextInt();

        System.out.println("Prime number? " + isPrime(number));
        System.out.println("Neon number? " + isNeon(number));
        System.out.println("Spy number? " + isSpy(number));
        System.out.println("Automorphic number? " + isAutomorphic(number));
        System.out.println("Buzz number? " + isBuzz(number));

        sc.close();
    }
}