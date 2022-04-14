package pattern;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 print the following pattern 
 
 1
 1  2
 1  2  3
 1  2  3  4
 
 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		 
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
