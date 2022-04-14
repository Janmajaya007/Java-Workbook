package recursion;

import java.util.Scanner;

public class nth_fibonaci_number {
	
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 
		 int n=sc.nextInt();
		 
		System.out.print(fibonaci(n)+" ");
		
		sc.close();
		
	}
	
	private static int fibonaci(int n) {
		
		 while(n<=1) {
			 
			 return n;
			 
		 }
		 
		return fibonaci(n-1)+fibonaci(n-2);
		
		 
	}
	
}
