package recursion;

import java.util.Scanner;

public class sum_of_n_natural_number {

	private static int sum(int n) {
	//	int s=0;
		 while(n==0) {
			 return 0;
		 }
		  return n+sum(n-1);
	}
	
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the value of n");
	 int n=sc.nextInt();
sc.close();
System.out.println( sum(n));
	}

	

}
