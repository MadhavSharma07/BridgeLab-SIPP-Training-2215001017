import java.util.*;

public class Convert_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double disInFeet = sc.nextDouble();
        double disInYards = disInFeet / 3;
        double disInMiles = disInYards / 1760;
        System.out.println("The distance in yards is " + disInYards + " while the distance in miles is " + disInMiles);
    }
}
