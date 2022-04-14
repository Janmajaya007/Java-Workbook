package recursion;

import java.util.Scanner;

public class count_digit_in_a_number {

	private static int  count(int n) {
		 if(n<10) {
			 return 1;
		 }
		return 1+count(n/10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 
		System.out.println(count(n));
		sc.close();
		
	}

	

}
