package String__;

import java.util.Scanner;

public class valid_Suffle_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1");
		String str1 = sc.next();
		System.out.println("Enter the String2");
		String str2 = sc.next();
		System.out.println("Enter the pattern");
		String pattern = sc.next();
		System.out.println(" pattern status is_______");
		suffle(str1, str2, pattern);
		sc.close();
	}

	public static void suffle(String str1, String str2, String pattern) {
		 int l1=str1.length(), l2=str2.length(), l3=pattern.length();
		 int i=0, j=0, k=0 ;
		 if((l1+l2)!=l3) {
			 System.out.println("length are not equal");
			 
		 }
		 else if ((l1+l2)==l3){
			 while(k<l3) {
				 if((i<l1)&&(str1.charAt(i)==pattern.charAt(k)))
					 i++;
				 else if((j<l2)&&(str2.charAt(j)==pattern.charAt(k)))
					 j++;
				 else {
					 
					 System.out.println("This is not the right suffle");
				  break;
				 }
				 k++;
			 }
		 }
		 
		 if(l1<=i && l2<=j) {
			 System.out.println("This is the right suffle");
		 }
		 
		
	}

}
