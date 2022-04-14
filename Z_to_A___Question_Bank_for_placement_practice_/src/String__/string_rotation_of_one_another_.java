package String__;

import java.util.Scanner;

public class string_rotation_of_one_another_ {
	/*
	 * Given a string s1 and a string s2, write a snippet to say whether s2 is a
	 * rotation of s1? (eg given s1 = ABCD and s2 = CDAB, return true, given s1 =
	 * ABCD, and s2 = ACBD , return false)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = sc.next();
		System.out.println("Enter the second String");
		String str2 = sc.next();

		checkRotation(str1, str2);
		sc.close();

	}

	public static void checkRotation(String str1, String str2) {
		String str = str1.concat(str1);
		int l1 = str.length(), l2 = str2.length();
		int count=0;
		for (int i = 0; i <= l1 - l2; i++) {
            String s=str.substring(i, i+l2);
            if(s.compareTo(str2)==0) {
            	count++;
            	System.out.println(str2+" is the cyclic rotation of  "+str1);
            	break;
            }	
		}
		 if(count==0)
		 {
			 System.out.println(str2+" is not the cyclic rotation of  "+str1);
		 }
	}

}
