package localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTime {
	public static void main(String[] args) {
		LocalDate date1 =  LocalDate.of(2015, 12, 1);
		LocalDate date2 = LocalDate.of(2016, 12, 10);
		
		String someTime = "2015/01/01";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date3 = LocalDate.parse(someTime, formatter);
		System.out.println("Date3 " + date3);
		
		long numOfDays = ChronoUnit.DAYS.between(date3.plusDays(1), date1);
		System.out.println("Days " + numOfDays);
		
		long numOfWeeks = ChronoUnit.WEEKS.between(date1, date2.plusDays(1));
		System.out.println("Weeks " + numOfWeeks);
		
		long numOfMonths = ChronoUnit.MONTHS.between(date1, date2.plusDays(1));
		System.out.println("Months " + numOfMonths);
	}
}
