import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class DateFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in the format dd-MM-yyyy:");
        String inputDate = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Date in dd/MM/yyyy format: " + date.format(format1));
        System.out.println("Date in yyyy-MM-dd format: " + date.format(format2));
        System.out.println("Date in EEE, MMM dd, yyyy format: " + date.format(format3));

    }
}
