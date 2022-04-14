package skill;

import java.util.Scanner;

public class print_n_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		 for (int i=1; i<=n; i++)
		 {
			 System.out.println(i);
		 }
		 System.out.println();
		 
		 System.out.println("Print in reverse order");
		 for (int j=n; j>=1; j--)
		 {
			 System.out.println(j);
		 }

	        
	                                                            }

}
