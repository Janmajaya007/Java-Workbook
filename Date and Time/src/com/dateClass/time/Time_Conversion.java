package com.dateClass.time;

import java.util.Scanner;

public class Time_Conversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time");
		String time = sc.next();
		String result = convertTime(time);
		System.out.println("The new 24H format  of " + time + " is " + result);
		sc.close();

	}

	public static String convertTime(String s) {
		String str[] = s.split(":");
		int hour = Integer.parseInt(str[0]);
		int min = Integer.parseInt(str[1]);
		int second = Integer.parseInt(str[2].substring(0, 2));
		String amPm = str[2].substring(2);

		String result = "";
		if (amPm.equalsIgnoreCase("AM")) {
			result = String.format("%02d:%02d:%02d", (12 - hour), min, second);
			if (hour < 12) {
				result = String.format("%02d:%02d:%02d", hour, min, second);
			}
		}
		if (amPm.equalsIgnoreCase("PM")) {
			result = String.format("%02d:%02d:%02d", (hour + 12), min, second);
			if (hour == 12) {
				result = String.format("%02d:%02d:%02d", hour, min, second);
			}
		}
		return result;
	}

}
