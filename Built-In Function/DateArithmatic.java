
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.*;

public class DateArithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in the format dd-MM-yyyy:");
        String inputDate = sc.next();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, format);

        date = date.plusDays(07);
        date = date.plusMonths(01);
        date = date.plusYears(02);
        date = date.minusWeeks(03);

        System.out.println("The final date is: " + date.format(format));

    }
}
