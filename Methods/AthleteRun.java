import java.util.*;

public class AthleteRun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side A of the triangle (in meters): ");
        double A = sc.nextDouble();

        System.out.print("Enter side B of the triangle (in meters): ");
        double B = sc.nextDouble();

        System.out.print("Enter side C of the triangle (in meters): ");
        double C = sc.nextDouble();

        AthleteRun round = new AthleteRun();
        int rounds = round.calculateRounds(A, B, C);

        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");
    }

    public int calculateRounds(double a, double b, double c) {

        double distance = 5000;
        int rounds = (int) Math.ceil(distance / (a + b + c));
        return rounds;
    }
}
