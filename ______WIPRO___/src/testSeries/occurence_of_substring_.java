package testSeries;

import java.util.*;

public class occurence_of_substring_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		String sub=sc.next();
		int c=0;
		for(int i=0;i<(str.length()-sub.length());i++) {
			String ss=str.substring(i, (i+sub.length())); 
			if(ss.equals(sub)) {
				c++;
			}
		}
		System.out.println(c);
	}
}
