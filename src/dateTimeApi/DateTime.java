package dateTimeApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		LocalDate l = LocalDate.now();
		System.out.println(l);
		l = LocalDate.of(2000, 12, 30);
		System.out.println(l);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		l = LocalDate.parse("25-03-2022" , df);
		System.out.println(l);
		
		l = l.minusDays(2);
		System.out.println(l);
		
		l = l.plusYears(3);
		System.out.println(l);
	}

}
