package date_and_time_java_8_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

/*
 * We will learn about : 
 * -what is period class?
 * -how to use period class?
 */

public class periods {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
		Period period = Period.ofWeeks(1);
//		start.toEpochDay(); // number of days since January 1 1970
		
//		cleanAnimalCage(start, end);
		cleanAnimalCage(start, end, period);
		
		System.out.println(start.plus(period));
		System.out.println(LocalDateTime.now().plus(period));
//		System.out.println(LocalTime.now().plus(period));  // unsupported unit days (cannot add days to time)
		
		
		Period yearAndMonth = Period.ofYears(1).ofMonths(1);
		System.out.println(yearAndMonth);  // P = period, 1M is 1 month
		
		Period yearAndMonth1 = Period.of(1,1,0);
		System.out.println(yearAndMonth1);  // P = period, 1M is 1 month
		
		}
	
	public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
		while(start.isBefore(end)) {
			System.out.println("Need to clean the cage on date= " + start);
			start = start.plus(period);
		}
	}
	
	public static void cleanAnimalCage(LocalDate start, LocalDate end) {
		while (start.isBefore(end)) {
			System.out.println("Need to clean the cage on date= " + start);
			start = start.plusMonths(1); // adding 1 month
		}


	}

}
