package recursion;

import java.util.Scanner;

public class factorial_of_n {

	private static int factorial(int n) {
 while(n==0) {
	 return 1;
 }
 
return n*factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 
		System.out.println(factorial(n));
		sc.close();
	}

	

}
