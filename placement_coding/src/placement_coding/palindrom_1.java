package placement_coding;

import java.util.Scanner;

public class palindrom_1 {
	
	

	public static void main(String[] args) {
		//  Given a string find minimum number of append to make the string one palindrom
		//*Rearranging of the string is not allowed
		// sample input- abcec
		//sample output- 2
		//COGNIZENT interview question
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the String");
		 String s=sc.next();		
		 int n=s.length();
		 int i;
		 for( i=0; i<n; i++) {
			 if(checkPalindrom(s, i, n-1))
				 break;
		 }
		 System.out.println(i);

	}

	 static boolean checkPalindrom(String s, int i, int j) {
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) 
				return false;
			i++;
			j--;
		}
		return true;
	}

}
