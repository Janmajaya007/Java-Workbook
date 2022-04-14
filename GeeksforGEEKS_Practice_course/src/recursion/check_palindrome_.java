package recursion;

import java.util.Scanner;

public class check_palindrome_ {

	public static boolean palindrom(String s, int start, int end) {
		
		while(start>=end) {
			return true;
		}
		
		return  (s.charAt(start)==(s.charAt(end)) && palindrom(s, start+1,end-1) );
 		
	}
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		 int end=s.length()-1;
		 int start=0;
		 sc.close();

 System.out.println( palindrom(s, start,  end));
	}

	 

}
