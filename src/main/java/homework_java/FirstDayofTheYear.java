package homework_java;

import java.time.LocalDate;
import java.time.Month;

public class FirstDayofTheYear {

	public static void main(String[] args) {
	
		int year=2020;
		
		LocalDate firstDay = LocalDate.of(2023, Month.JANUARY, 1);
		
		System.out.println("First Day of  " + year + " is ....." + firstDay.getDayOfWeek());
		
		
	}

}
