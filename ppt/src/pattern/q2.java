package pattern;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
/*
 print the following pattern
 
 1  1  1  1
 1  1  1  1
 1  1  1  1
 1  1  1  1
 
 */

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		System.out.println("Enter the number of column");
		int col=sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print("1  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
