package com.dateClass;


import java.time.LocalDateTime;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class mallParkingSystem {

	
	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
        DateTimeFormatter
                dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String nowTimeStr = "29/10/2019 20:10";

        System.out.println("In-time");
        String inTimeStr = scanner.nextLine();
        LocalDateTime inTime = null;

        try {
            inTime = LocalDateTime.parse(inTimeStr, dateTimeFormatter);
        } catch (Exception ignore) {
            System.out.println(inTimeStr + " is an Invalid In-Time");
            System.exit(1);
        }

        LocalDateTime now = LocalDateTime.parse(nowTimeStr, dateTimeFormatter);

        if (inTime.compareTo(now) >= 0) {
            System.out.println(inTimeStr + " is an Invalid In-Time");
            System.exit(1);
        }

        System.out.println("Out-time");
        String outTimeStr = scanner.nextLine();
        LocalDateTime outTime = null;

        try {
            outTime = LocalDateTime.parse(outTimeStr, dateTimeFormatter);
        } catch (Exception ignore) {
            System.out.println(outTimeStr + " is an Invalid Out-Time");
            System.exit(1);
        }

        if (inTime.compareTo(outTime) >= 0) {
            System.out.println(outTimeStr + " is an Invalid Out-Time");
            System.exit(1);
        }

        long hours = inTime.until(outTime, ChronoUnit.HOURS);
        long fee = hours * 10 + 10L;
        System.out.println(fee + " Rupees");
	}

}
/*
Sample Input 1:

In-time

20/09/2019 23:55

Out-time

21/09/2019 23:56

Sample Output 1:

250 Rupees


Sample Input 2:

In-time

25/10/2019 03:05

Out-time

25/10/2019 03:06

Sample Output 2:

10 Rupees


Sample Input 3:

In-time

29/10/2019 20:10

Sample Output 3:

29/10/2019 20:10 is an Invalid In-Time 

Explanation:   Invalid In-time since it is not lesser than the current system date and time  29/10/2019 20:10 for at-least 1 Minute



Sample Input 4:

In-time

20/09/2019 23:55

Out-time

20/08/2019 23:55

Sample Output 4:

20/08/2019 23:55 is an Invalid Out-Time
*/