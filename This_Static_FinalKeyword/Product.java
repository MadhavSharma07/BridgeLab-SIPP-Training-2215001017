import java.util.*;

public class Product {
    final int productID;
    String productName;
    double price;
    int quantity;
    static double discount = 10.0;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }
    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            double total = (price * quantity);
            double discountedPrice = total - (total * discount / 100);
            System.out.println("Total after discount: $" + discountedPrice);
        } else {
            System.out.println("Invalid Product object.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] cart = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            System.out.print("Product ID: ");
            int productID = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            cart[i] = new Product(productID, name, price, quantity);
        }

        System.out.print("\nWould you like to update the discount? (yes/no): ");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter new discount percentage: ");
            double newDiscount = sc.nextDouble();
            updateDiscount(newDiscount);
        }
        System.out.println("\n Shopping Cart");
        for (Product p : cart) {
            System.out.println("\nProduct Details: ");
            p.displayDetails();

        }

    }
}