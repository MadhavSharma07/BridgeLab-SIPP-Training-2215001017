import java.util.*;

public class Main {
    public static void main(String[] args) {
        double number1, number2;
        double sum, difference, product, quotient;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                           number1 + " and " + number2 + " is " +
                           sum + ", " + difference + ", " + product + ", and " + quotient);
    }
}
