import java.util.*;

public class FeeDiscount {
    public static void main(String[] args) {
        double fee, discountPercent, discount, finalFee;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Student Fee (INR): ");
        fee = input.nextDouble();

        System.out.print("Enter the University Discount Percentage: ");
        discountPercent = input.nextDouble();

        discount = (discountPercent / 100) * fee;
        finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
