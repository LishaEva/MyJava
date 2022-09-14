package dateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class Dates {

	public static void main(String[] args) {
		// try {
		// System.out.println(getcurrentDate());// When return statement is found,
		// sysout is to be used
		// fetchMonthfromDate("18-12-1989");
		// NoOfDays("17-10-1987", "18-12-1989");
		// NoOfDaysCalc();
		NoofDaysinBetween();
		// System.out.println(SortDates());
		ConversionOf_List_Arrays();
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
	}

	public static int getcurrentDate() throws ParseException {
		return Calendar.getInstance().get(Calendar.DATE);

	}

	public static void fetchMonthfromDate(String input) {
		// Input in "18-12-1989" format
		String[] date = input.split("-");
		// System.out.println("Month in the given date is :" + date[1]);
		System.out.println("Year in the given date is :" + date[2]);
		System.out.println("Day in the given date is :" + date[0]);
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
		String dateStrA = "09-06-2011";
		String dateStrB = "12-08-2022";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dateA = LocalDate.parse(dateStrA, format);
		LocalDate dateB = LocalDate.parse(dateStrB, format);
		System.out.println("Difference in Days:" + ChronoUnit.DAYS.between(dateA, dateB));
		System.out.println(dateA + " And" + dateB);
		System.out.println("Difference in Months" + ChronoUnit.MONTHS.between(dateA, dateB));

	}

	public static void NoofDaysinBetween() {
		String datefirst = "06/04/2022";
		String datesecond = "23/07/2022";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dateFirst = LocalDate.parse(datefirst, formatter);
		LocalDate dateSecond = LocalDate.parse(datesecond, formatter);
		System.out.println(ChronoUnit.DAYS.between(dateSecond, dateFirst));
	}

	public static List<String> SortDates() {
		String[] datesAsString = { "18-12-1989", "17-10-1987", "30-01-1997" };
		List<String> datesAslist = Arrays.asList(datesAsString);
		Collections.sort(datesAslist);
		System.out.println("inside");
		return datesAslist;
	}

	public static void ConversionOf_List_Arrays() {
		String[] datesAsArray = { "18-12-1989", "17-10-1987", "30-01-1997" };

		List<String> datesAsList = Arrays.asList(datesAsArray);
		System.out.println("LIST:" + datesAsList);

		String[] DatesToArray = new String[datesAsList.size()];
		DatesToArray = datesAsList.toArray(DatesToArray);
		System.out.println("ARRAY:" + DatesToArray);// provides avalue like [Ljava.lang.String;@3cda1055
		for (String item : DatesToArray) {
			System.out.println(item);
		}

	}

	public static String DesiredDate(int days) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -days);
		String newdate = formatter.format(cal.getTime());
		return newdate;
	}
}
