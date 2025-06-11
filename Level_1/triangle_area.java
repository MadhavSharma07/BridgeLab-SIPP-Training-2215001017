import java.util.*;

public class Main {
    public static void main(String[] args) {
        double base, height;
        double areaInInches, areaInCm;
        final double INCH_TO_CM = 2.54;
        final double SQUARE_INCH_TO_CM = INCH_TO_CM * INCH_TO_CM;  // 1 in² = 6.4516 cm²

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        height = input.nextDouble();

        areaInInches = 0.5 * base * height;
        areaInCm = areaInInches * SQUARE_INCH_TO_CM;

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " +
                           areaInCm + " square centimeters.");
    }
}
