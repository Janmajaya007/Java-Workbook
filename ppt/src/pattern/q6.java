package pattern;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		/*
		 print the following pattern
		 1 
		 2  4  
		 3  6  9
		 4  8  12  16
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		 
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(i*j+"  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
