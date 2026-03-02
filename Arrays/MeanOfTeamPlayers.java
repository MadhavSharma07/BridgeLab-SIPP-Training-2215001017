import java.util.*;

public class MeanOfTeamPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[11];
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            System.out.println("Enter the score of player " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
            sum += arr[i];

        }

        double mean = sum / 11;
        System.out.println("The mean of the team players is: " + mean);
    }
}
