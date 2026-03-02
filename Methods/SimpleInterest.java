
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        int principal = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period: ");
        int time = sc.nextInt();

        int SI = simpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is" + "\t" + SI + " for Principal" + "\t" + principal
                + " , Rate of Interest " + "\t" + rate + " and Time" + "\t" + time);

    }

    public static int simpleInterest(int principal, double rate, int time) {

        double SI = (principal * rate * time) / 100;
        return (int) SI;
    }
}