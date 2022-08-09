package dateAndTime;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Dates {

	public static void main(String[] args) {
		try {
			System.out.println(getcurrentDate());// When return statement is found, sysout is to be used
			fetchMonthfromDate("18-12-1989");
			NoOfDays("17-10-1987", "18-12-1989");
			NoOfDaysCalc();
		} catch (ParseException e) {

			e.printStackTrace();
		}

	}

	public static int getcurrentDate() throws ParseException {
		return Calendar.getInstance().get(Calendar.DATE);

	}

	public static void fetchMonthfromDate(String input) {
		String[] date = input.split("-");
		System.out.println("Month in the given date is :" + date[1]);
	}
	// SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY");
	// Date df = format.parse(input);
	// System.out.println

	public static void NoOfDays(String a, String b) {
		String dateStrA = "2020-08-17T10:11:16";
		String dateStrB = "2016-08-17T10:11:16";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		LocalDateTime dateTimeA = LocalDateTime.parse(dateStrA, format);
		LocalDateTime dateTimeB = LocalDateTime.parse(dateStrB, format);
		System.out.println(dateTimeB);
		System.out.println(ChronoUnit.DAYS.between(dateTimeB, dateTimeA));
	}

	public static void NoOfDaysCalc() {
		// NOTE: year should be in yyyy NOT YYYY
		String dateStrA = "17-10-1987";
		String dateStrB = "18-12-1989";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dateA = LocalDate.parse(dateStrA, format);
		LocalDate dateB = LocalDate.parse(dateStrB, format);
		System.out.println("Difference ion Days:" + ChronoUnit.DAYS.between(dateA, dateB));
		System.out.println(dateA + " And" + dateB);
		System.out.println("Difference in Months" + ChronoUnit.MONTHS.between(dateA, dateB));
	}
}
