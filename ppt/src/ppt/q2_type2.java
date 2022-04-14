package ppt;

import java.util.Scanner;

public class q2_type2 {

	public static void main(String[] args) {
		 // here we implement the q2 in another way
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter tne value of N");
		int n= sc.nextInt();
		if(n>=1) {
			while(n>=1) {
				System.out.print("  "+n--);
			}
		}
		else {
			while(n<=1) {
				System.out.print("  "+n++);
			}
		}
	}

}
