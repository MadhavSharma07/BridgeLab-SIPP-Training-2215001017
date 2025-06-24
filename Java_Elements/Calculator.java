import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        float add = num1 + num2;
        float sub = num1 - num2;
        float mul = num1 * num2;
        float div = num2 != 0 ? num1 / num2 : 0;

            System.out.println("The addition, subtraction, multiply, and division value of 2 numbers " + num1 + " and " + num2 + 
                               " is " + add + ", " + sub + ", " + mul + ", and " + div);
  

    }
}
