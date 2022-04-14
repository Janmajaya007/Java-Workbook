package com.dateClass;

import java.time.temporal.ChronoField;
import java.time.*;

public class practice {

	public static void main(String[] args) {
		// Use-case 1: Software renewal	
		LocalDate SubscriptionEnd =  LocalDate.of(2017, Month.JUNE,03);
		System.out.println("SubscriptionEnd: "+ SubscriptionEnd);
		//adding months
		System.out.println("I have extended it for 9 more months: ");
		LocalDate newdate = SubscriptionEnd.plusMonths(9);
		System.out.println("The New subscription will end on: "+ newdate);
		//subtracting months
		LocalDate birthday = newdate.minusMonths(2);
		System.out.println("The new subscription will end after two months of my birthday whic is on: "+birthday);
		
		// Other methods:  isBefore, isAfter
		
		System.out.println("------------My birthday details-------------");
		System.out.println("Day of Month: "+birthday.getDayOfMonth());
		System.out.println("Day of Year: "+birthday.getDayOfYear());
		System.out.println("Month: "+birthday.getMonthValue());
		System.out.println("Month of Year:  "+birthday.getMonth());
		System.out.println("Year:  "+birthday.getYear());
		System.out.println("Is this a leap Year (true/false) "+birthday.isLeapYear() );
		
		
		// get returns an int 
		System.out.println("year again: " + birthday.get(ChronoField.YEAR)); 
		System.out.println("month again: " + birthday.get(ChronoField.MONTH_OF_YEAR));
		System.out.println("day of month again: " + birthday.get(ChronoField.DAY_OF_MONTH));
		System.out.println();
		// parse string 
		LocalDate epoch = LocalDate.parse("1970-01-01"); // yyyy-mm-dd 
		System.out.println("epoch year: " + epoch.getYear());
		System.out.println();
		System.out.println();
		// Use-case 2: Game start time localized to time zone

		// LocalTime
		LocalTime present =LocalTime.of(9, 45, 30);
		System.out.println("Pesent time is: "+present);
		//LocalDate
		LocalDate date =LocalDate.of(2022, Month.MARCH, 26);
		System.out.println("Today date is: "+date);
		//LocalDateTime
		LocalDateTime dateTime =LocalDateTime.of(date, present);
		System.out.println("Local Date and time is: "+dateTime);
		//ZonedDateTime
		ZonedDateTime zdt= ZonedDateTime.of(dateTime, ZoneId.of("Asia/Kolkata"));
		System.out.println("Local ZoneDateTime: "+ zdt);
		
		ZonedDateTime pst = zdt.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		System.out.println("pst: " + pst);
		
		ZonedDateTime london = zdt.withZoneSameInstant(ZoneId.of("Europe/London"));
		System.out.println("Londoan: " + london);
		
		// Use-Case 3: Age calculation (Period)
		LocalDate birth =LocalDate.of(2000, Month.AUGUST, 19);
		LocalDate today = LocalDate.now();
		Period age = birth.until(today);
		System.out.println("My present age: "+ age);
		System.out.println("My age in year: "+age.getYears());
		System.out.println("My age in Months: "+age.getMonths());
		System.out.println("My age in Days: "+age.getDays());
		
		// Use-Case 4: Interval timing (Instant & Duration)
		
		 Instant startTime = Instant.now();
	
		 Instant endTime = Instant.now(); 
		 Duration timeElapsed =	 Duration.between(startTime, endTime); 
		 System.out.println("timeElapsed in ms: " + timeElapsed.toMillis());
		 

		// Partial Classes
		System.out.println("Christmas: " + MonthDay.of(Month.DECEMBER, 25));
		System.out.println("Credit card expiry date: " + YearMonth.of(2017, Month.JULY));

		// Don't forget to check out the API
		
	}

}
