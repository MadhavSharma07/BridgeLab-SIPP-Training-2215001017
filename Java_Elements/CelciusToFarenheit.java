import java.util.*;

public class CelciusToFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double C = sc.nextDouble();
        double F = (C * 9 / 5) + 32;
        System.out.println("The " + C + " celsius is " + F + " fahrenheit");
    }
}
