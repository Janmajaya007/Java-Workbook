package recursion;

import java.util.Scanner;

public class Check_Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(palindrom(n));
	}
	public static boolean palindrom(int n){
		String s=Integer.toString(n);
		int i=0; 
		int j=s.length()-1;
		return pali(s, i, j);
	}
	public static boolean pali(String s, int i, int j) {
 		if(i>=j) {
 			return true;
 		}
		return  ((s.charAt(i)==s.charAt(j)) && (pali(s, i+1, j-1)));
	}
}
