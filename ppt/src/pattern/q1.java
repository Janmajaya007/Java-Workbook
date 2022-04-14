package pattern;

import java.util.Scanner;

public class q1 {
	

	public static void main(String[] args) {
		 
/*
  print the pattern 
  *
  * *
  * * *
  * * * *
 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		sc.close();
	}

}
