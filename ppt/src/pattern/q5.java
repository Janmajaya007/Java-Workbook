package pattern;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
      print the following pattern
      
      1
      2  3
      4  5  6
      7  8  9  10
 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		 
		int c=0;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				c++;
				System.out.print(c+"  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
