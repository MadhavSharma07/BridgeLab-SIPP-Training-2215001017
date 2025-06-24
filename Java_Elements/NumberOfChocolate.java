import java.util.*;

public class NumberOfChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int Chocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int Children = sc.nextInt();

        int chocolatesPerChild = Chocolates / Children;
        int remainingChocolates = Chocolates % Children;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                           " and the number of remaining chocolates is " + remainingChocolates);
    }
}
