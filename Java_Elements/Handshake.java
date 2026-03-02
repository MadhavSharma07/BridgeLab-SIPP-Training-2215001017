import java.util.*;

public class Handshake {
    public static void main(String[] args) {
        int Students;
        int totalHandshakes;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        Students = input.nextInt();

        totalHandshakes = (Students * (Students - 1)) / 2;

        System.out.println("The maximum number of handshakes among " + Students +
                " students is " + totalHandshakes);
    }
}
