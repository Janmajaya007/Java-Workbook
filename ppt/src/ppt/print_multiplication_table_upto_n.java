package ppt;

import java.util.Scanner;

public class print_multiplication_table_upto_n {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the value of n");
	 int n=sc.nextInt();
	 for(int i=0;i<=n;i++) {
		 for(int j=0;j<=10;j++) {
			 System.out.printf("%d x %d = %d", i, j , i*j);
			 System.out.println();
		 }
		 System.out.println();
		 System.out.println();
	 }

	}

}
