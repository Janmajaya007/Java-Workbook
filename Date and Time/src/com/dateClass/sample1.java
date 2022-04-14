package com.dateClass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class sample1 {

	@SuppressWarnings({ "deprecation", "static-access" })
	public static void main(String[] args) {
		System.out.println("Date Class");
		Date currentdate = new Date();
		System.out.println("Cuurent Date is: "+currentdate);
		System.out.println("Current time in milisecond: "+ currentdate.getTime());
		System.out.println("Calender Class");
		Calendar calendar= new GregorianCalendar(2017, 07, 19);
		System.out.println("Last day of your Netflix Subscription: "+calendar.getTime());
		System.out.println("Extend the subscription for 9 months");
		calendar.add(calendar.MONTH, 9);
		System.out.println("Now my new last date of subscription end is: "+ (calendar.getTime()));
		
		String[] timeZones = TimeZone.getAvailableIDs();
		
		/*for(String timezone: timeZones) {
			System.out.println(timezone);
		}*/
		
	}

}
