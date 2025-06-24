
import java.util.Scanner;

public class UnitConverterTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value in yards: ");
        double yards = scanner.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        System.out.print("Enter value in feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.print("Enter value in meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        System.out.print("Enter value in inches: ");
        double inches = scanner.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");

        System.out.print("Enter value in inches (to convert to cm): ");
        double inchesForCm = scanner.nextDouble();
        System.out.println(inchesForCm + " inches = " + convertInchesToCentimeters(inchesForCm) + " cm");

    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet / 3;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches / 39.3701;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
}