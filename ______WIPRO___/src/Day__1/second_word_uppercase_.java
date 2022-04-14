package Day__1;

import java.util.*;

public class second_word_uppercase_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strint str");
		String str=sc.nextLine();
		
		System.out.println(uppercase(str));
		sc.close();

	}

	private static String uppercase(String input1) {
		// TODO Auto-generated method stub
		String str[]=input1.split(" ");
		String upper="LESS";
		if(str.length>1)
		{
			String s=str[1];
			s=s.toUpperCase();
			return s;
		}
		 
		return upper;
	}

}
