package skill;
import java.io.*;
import java.util.*;
//import java.util.Scanner;

public class time_conversion_ {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the time");
		 String time=sc.nextLine();
		 int hour=Integer.parseInt(time.substring(0,2));
		 int minute=Integer.parseInt(time.substring(3,5));
		 int second=Integer.parseInt(time.substring(7,9));
		 String meridian=time.substring(8, 10);
		 
		 hour+=((meridian.equals("PM") && hour!= 12)? 12:0);
		 hour-=((meridian.equals("AM") && hour== 12)? 12:0);
		 System.out.println(String.format("%02d", hour)+":"+String.format("%02d", minute)+":"+String.format("%02d", second));
	}

}
