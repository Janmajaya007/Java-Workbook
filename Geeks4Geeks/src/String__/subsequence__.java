package String__;

import java.util.Scanner;

public class subsequence__ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string");
		String str2 = sc.nextLine();
		boolean val=subsequence(str1, str2);
		System.out.println(val);
		sc.close();

	}

	public static boolean subsequence(String str1, String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		 int i=0, j=0, l1=str1.length(), l2=str2.length() ;
		 if(l1==0) {
			 return true;
		 }
		 while(i<l1 && j<l2) {
			 if(str1.charAt(i)==str2.charAt(j)) {
				 i++;
			 }
			 if(str1.length()==i) {
				 return true;
			 }
			 j++;
		 }
		  
		 
		 return false;
		
	}

}
