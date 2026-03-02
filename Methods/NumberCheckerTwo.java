
import java.util.*;

public class NumberCheckerTwo {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;
        for (int i : freq)
            if (i > 0)
                count++;

        int[][] result = new int[count][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }

    public static void printFrequency(int[][] freqArray) {
        System.out.println("Digit | Frequency");
        for (int[] row : freqArray) {
            System.out.println("  " + row[0] + "   |    " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);
        int digitSum = sumOfDigits(digits);
        int squareSum = sumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, digits);
        int[][] freqArray = digitFrequency(digits);

        System.out.println("\nResults:");
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Sum of squares of digits: " + squareSum);
        System.out.println("Is Harshad Number: " + isHarshad);
        printFrequency(freqArray);

        sc.close();
    }
}