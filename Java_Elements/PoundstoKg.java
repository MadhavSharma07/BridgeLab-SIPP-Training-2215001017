import java.util.*;

public class PoundstoKg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weight = sc.nextDouble();
        double weight_In_Kg = weight / 2.2;
        System.out.println("The weight of the person in pounds is " + weight + " and in kg is " + weight_In_Kg);
    }
}
