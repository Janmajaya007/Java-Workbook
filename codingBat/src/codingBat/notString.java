package codingBat;

import java.util.Scanner;

public class notString {

	public static void main(String[] args) {
	 
		 Scanner sc= new Scanner(System.in);
		 String s=sc.next();
		 String n="not";
		 if(s.subSequence(0,3)==n)
			 System.out.println( s);
		 else 
			 System.out.println(n+s);
		 sc.close();
		
	}
}
