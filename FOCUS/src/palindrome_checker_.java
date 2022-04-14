import java.util.Scanner;

public class palindrome_checker_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		   String str=sc.next();
		   palindrome(str);
		   sc.close();
	}

	private static void palindrome(String str) {
		// TODO Auto-generated method stub
		 StringBuilder rev= new StringBuilder(str);
		 rev.reverse();
		 if(str.equals(rev.toString())==true)
			 System.out.println(1);
		 else
			 System.out.println(0);
}}
