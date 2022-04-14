package recursion;

import java.util.Scanner;

public class sum_of_numbers_of_the_digit {

	private static int add(int n   ) {
		 
		while(n<10) {
			return n;
			
			
		}
		  
		return add(n/10 )+n%10;
	}

	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
	 
System.out.println(add(n ));
sc.close();
	}

	
}
