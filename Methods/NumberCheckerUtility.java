
import java.util.*;

public class NumberCheckerUtility {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String str = Integer.toString(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }

    public static int[] findLargestTwo(int[] digits) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > max) {
                secondMax = max;
                max = digit;
            } else if (digit > secondMax && digit != max) {
                secondMax = digit;
            }
        }
        return new int[] { max, secondMax };
    }

    public static int[] findSmallestTwo(int[] digits) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < min) {
                secondMin = min;
                min = digit;
            } else if (digit < secondMin && digit != min) {
                secondMin = digit;
            }
        }
        return new int[] { min, secondMin };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("\nNumber: " + number);
        System.out.println("Digit Count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits)
            System.out.print(d + " ");
        System.out.println();

        System.out.println("Duck Number: " + isDuckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(number, digits));

        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest Digit: " + largestTwo[0]);
        System.out
                .println("Second Largest Digit: " + (largestTwo[1] == Integer.MIN_VALUE ? "Not Found" : largestTwo[1]));

        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest Digit: " + smallestTwo[0]);
        System.out.println(
                "Second Smallest Digit: " + (smallestTwo[1] == Integer.MAX_VALUE ? "Not Found" : smallestTwo[1]));
    }
}