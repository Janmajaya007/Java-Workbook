package ppt;

import java.util.Scanner;

public class q2 {
	
	//q2_Print all the digit from n to 1

	public static void main(String[] args) {
		  Scanner s= new Scanner(System.in);
System.out.println("Enter the number");
int n= s.nextInt();
if (n>=1) {
for(int i=n; i>=1; i--) {
	System.out.print("   "+i);
}}
else
{
	for(int i=n; i<=1; i++) {
		System.out.print("   "+i);
}
	}

}}
