package skill;

import java.util.Calendar;

public class date_and_time_ {
	
	int nameOfTheDay() {
		Calendar cal = Calendar.getInstance();
		 int day= cal.get(Calendar.DAY_OF_WEEK);
		return day;
		
	} 
	String dayName () {
		Calendar c= Calendar.getInstance();
		int n= c.get(Calendar.DAY_OF_WEEK);
		String daysname="";
		switch (n) {
		    case 1:
				 daysname= "Sunday";
				break;
			case 2:
			      daysname= "Monday";
				break;
			case 3:
			      daysname= "Tuesday";
				break;
			case 4:
				  daysname= "Wednesday";
				break;
			case 5:
				  daysname= "Thursdayday";
				break;
			case 6:
				  daysname= "Fridayday";
				break;
			case 7:
				  daysname= "Saturday";
				break;
			 default:
			 return null;
	}
		return daysname;
	}
	
	  void backDate() {
		Calendar cal= Calendar.getInstance();
	cal.add(Calendar.DATE,  -15);
	System.out.println("  "+cal.getTime());
	 
	
	}
public static void main(String[] args) {
Calendar cal = Calendar.getInstance();		 
System.out.println(cal.getTime());
System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
date_and_time_ dt=new date_and_time_();
  System.out.println(dt.nameOfTheDay());
  System.out.println(dt.dayName());
  dt.backDate();
	}

}
 