package pattern;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		 /*
		  print he following pattern
		         1
		       1   2
		     1   2   3
		   1   2   3   4     
		  */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		  int i;int j; 
	 for(i=1;i<=row;i++) {
		 System.out.println();
		 for(int sp=row;sp>i;sp--) {
			 System.out.print("  ");
			 for( j=1;j<=i;j++) {
				 System.out.print(j+"");
				 
			 }
		 }
	 }
	
		sc.close();
	}
}
