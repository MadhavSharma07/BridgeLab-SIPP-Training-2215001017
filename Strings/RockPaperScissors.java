
import java.util.*;

public class RockPaperScissors {
    static String[] choices = {"Rock", "Paper", "Scissors"};
    static int userWins = 0, computerWins = 0, ties = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] results = new String[games][4];
        for (int i = 0; i < games; i++) {
            System.out.print("\nEnter your choice (Rock, Paper, Scissors): ");
            String user = sc.nextLine().trim().toLowerCase();
            String computer = getComputerChoice();
            String winner = getWinner(user, computer);
            results[i][0] = "Game " + (i + 1);
            results[i][1] = capitalize(user);
            results[i][2] = computer;
            results[i][3] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else ties++;
        }

        displayResults(results);
        displayStats(games);
        sc.close();
    }
    public static String getComputerChoice() {
        int rand = (int) (Math.random() * 3);
        return choices[rand];
    }
    public static String getWinner(String user, String comp) {
        if (user.equals(comp.toLowerCase())) return "Tie";

        if ((user.equals("rock") && comp.equals("Scissors")) ||
            (user.equals("paper") && comp.equals("Rock")) ||
            (user.equals("scissors") && comp.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    public static String capitalize(String str) {
        if (str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    public static void displayResults(String[][] res) {
        System.out.println("\n--- Game Results ---");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Game", "User", "Computer", "Winner");
        for (String[] row : res) {
            System.out.printf("%-10s %-10s %-10s %-10s\n", row[0], row[1], row[2], row[3]);
        }
    }
    public static void displayStats(int total) {
        System.out.println("\n--- Summary Stats ---");
        double userPercent = (userWins * 100.0) / total;
        double compPercent = (computerWins * 100.0) / total;
        double tiePercent = (ties * 100.0) / total;

        System.out.println("User Wins     : " + userWins + " (" + String.format("%.2f", userPercent) + "%)");
        System.out.println("Computer Wins : " + computerWins + " (" + String.format("%.2f", compPercent) + "%)");
        System.out.println("Ties          : " + ties + " (" + String.format("%.2f", tiePercent) + "%)");
    }
}
