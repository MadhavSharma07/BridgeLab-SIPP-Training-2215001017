import java.util.*;

public class NumberOfRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 : ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 : ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 : ");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

    }
}
