package date_and_time_java_8_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/*
 * we will learn : 
 * -how to create dates and times
 * -how to create dates and times (java 7 and earlier)
 */

public class creating_date_and_time {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate localDate = LocalDate.of(2023, Month.OCTOBER, 7);
		LocalTime localTime = LocalTime.of(10, 30);
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(LocalDateTime.of(localDate, localTime));
		
		// before java 8
		System.out.println(new Date());
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2025, Calendar.JUNE, 1);
		Date june = calendar.getTime();
		System.out.println(june);
		

	}

}
