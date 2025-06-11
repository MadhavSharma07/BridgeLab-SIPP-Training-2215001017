import java.util.*;

public class Main {
    public static void main(String[] args) {
        double distanceInFeet;
        double distanceInYards, distanceInMiles;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance is " + distanceInFeet + " feet, which is " +
                           distanceInYards + " yards and " + distanceInMiles + " miles.");
    }
}
