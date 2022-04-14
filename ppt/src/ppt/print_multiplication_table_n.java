package ppt;

import java.util.Scanner;

public class print_multiplication_table_n {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.printf("%d x %d = %d", n, i, n*i);
			System.out.println();
		}

	}

}
