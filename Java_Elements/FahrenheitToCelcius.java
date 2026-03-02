import java.util.*;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double F = sc.nextDouble();
        double C = (F - 32) * 5 / 9;
        System.out.println("The " + F + " fahrenheit is " + C + " celsius");
    }
}
