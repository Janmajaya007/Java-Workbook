package ppt;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		 // Accept N value and print all the odd and even number from 1 to n
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of N");
		int n =sc.nextInt();
		System.out.println("Number from 1 t N");
		for (int i=1; i<=n; i++) {
			  System.out.print("  "+i);
			  }
		System.out.println();
		  System.out.println("all even number are here");
		for (int i=1; i<=n; i++) {
			
			  if(i%2==0) 
				  System.out.print("  "+i);			  
		}
		System.out.println();
		 System.out.println("all odd number are here");
			for (int i=1; i<=n; i++) {
				   if (i%2==1)
					 
				  System.out.print("  "+i);			  }
			
		
	}
	}

