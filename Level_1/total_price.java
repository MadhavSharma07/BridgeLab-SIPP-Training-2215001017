import java.util.*;

public class totalPrice {
    public static void main(String[] args) {
        double unitPrice, totalPrice;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price (INR): ");
        unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();

        totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity " + quantity + 
                           " and unit price is INR " + unitPrice);
    }
}

