package ppt;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
   // print fibonaci series upto N
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		 int i=0;int a=0, b=1, sum=0;
		   System.out.print (a+"  ");
		 while(sum<=n) {
			// System.out.print(a+"   "+b+"   ");
			 System.out.print( b+"   ");  
			 sum = a+b;
			
			  
			   a=b;
			   b=sum;
			 
			
			 
		}
		
	}

}
