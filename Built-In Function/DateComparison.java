import java.util.*;
import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first date in the format dd-MM-yyyy:");
        String inputDate1 = sc.nextLine();
        System.out.println("Enter the second date in the format dd-MM-yyyy:");
        String inputDate2 = sc.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(inputDate1, format);
        LocalDate date2 = LocalDate.parse(inputDate2, format);

        if(date1.isBefore(date2)){
		    System.out.print("Date1 is before to Date2");
	    }
	    else if(date1.isAfter(date2)){
		    System.out.print("Date1 is after to Date2");
	    }
	    else if(date1.isEqual(date2)){
		    System.out.print("Date1 is equal to Date2");
	    }
    }
}
