import java.util.*;

public class KmToMilesWithUserInput {
    public static void main(String[] args) {
        double km = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        km = input.nextInt();

        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
