package ppt;

import java.util.Scanner;

public class q6 {
//q6_ find the factorial of given number N
	public static void main(String[] args) {
		  Scanner sc = new Scanner (System.in) ;            int fact=1;
  		System.out.println("Enter the value of N");
  int n=sc.nextInt();
  if(n==0)
  {
	  System.out.println(fact);
  }
  else if(n>0) {
	  while (n>1) {
		  fact*=n--;
		  }
	  System.out.println("the factorial of N is"+fact);
  }
  else
	  System.out.println("Ooops .........the number is negative ");
	}
}
