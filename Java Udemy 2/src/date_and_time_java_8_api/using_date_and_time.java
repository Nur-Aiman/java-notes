package date_and_time_java_8_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/*
 * we will learn : 
 * -how to use date and time (java 8 and forward)
 * -how to use date and time (java 7 and earlier)
 */

public class using_date_and_time {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2030, Month.JANUARY, 10);
		System.out.println(date);
		date = date.plusDays(5).plusMonths(2); // will create another instance of date
		System.out.println(date);
		
		LocalTime time = LocalTime.of(10, 30);
		System.out.println(time);
		time = time.plusHours(2).plusMinutes(20);
		System.out.println(time);
		
		LocalDateTime localDateTime = LocalDateTime.of(date, time);
		System.out.println(localDateTime);
		localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);
		System.out.println(localDateTime);
		
		// before java 8
		Date myDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(myDate);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.MONTH, 2); // start from 0
		myDate = calendar.getTime();
		System.out.println(myDate);
		
		// exam tricks
		LocalDate ld = LocalDate.of(2010, Month.APRIL, 1);
		ld.plusDays(10);
		System.out.println(ld);
		
//		ld.plusMinutes(10);  // compilation error
		
		LocalTime lt = LocalTime.of(12, 45);
//		lt.addDays(3);  // compilation error
		
	}

}
