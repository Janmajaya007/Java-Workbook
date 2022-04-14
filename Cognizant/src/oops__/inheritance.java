package oops__;

import java.util.Scanner;
  abstract class people{
		
	  String name ;
 }
 class doctor extends people{
 
	 Scanner sc=new Scanner(System.in);
		String name=sc.nextLine() ;
		String specialization=sc.nextLine() ;
	
		String displayDetails() {
			return name+" is a "+ specialization ;
			
		}
 }
public class inheritance {
 public static void main (String[] args) {
		 doctor dec=new doctor();
		  
       System.out.println( dec.displayDetails());
	}
}
 
