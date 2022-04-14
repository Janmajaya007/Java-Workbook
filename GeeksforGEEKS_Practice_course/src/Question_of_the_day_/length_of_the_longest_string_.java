package Question_of_the_day_;

import java.util.Scanner;

public class length_of_the_longest_string_ {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the main String");
		 String str= sc.nextLine();
		 int length= longString(str);
		 System.out.println(length);
		 sc.close();

	}

	private static int longString(String str) {
		int k=0, j=0;
		char [] ch=str.toCharArray();
		for(int i=1; i<ch.length; i++)
		{
			if(ch[i-1]==ch[i]) {
				
			}
		}
		
		
		return 0;
	}

}
