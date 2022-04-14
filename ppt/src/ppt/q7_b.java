package ppt;

import java.util.Scanner;

public class q7_b {

	public static void main(String[] args) {
		// print fibonaci series upto N terms
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		 int i=0;int a=0, b=1, sum=0;
		   System.out.print (a+"  ");
		 while(n>1) {
			// System.out.print(a+"   "+b+"   ");
			 System.out.print( b+"   ");  
			 sum = a+b;
			   a=b;
			   b=sum;
			 n--;	 
		}
	}

}
