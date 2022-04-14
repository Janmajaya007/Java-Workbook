package company_specific_training_;

import java.util.Scanner;
/*
An e-commerce company plans to give their customers  a discount for the New Years holiday. The discount will be calculated 
on the basis of the bill amount of the order placed. The  discount amount is the product of the sum of all odd digits and 
the sum of all even digits of the customers total bill amount.
Write an algorithm to find the discount amount for the given total bill amount.
INPUT:
The input consists of an integer billAmount ,representing the total bill amount of a customer
OUTPUT:
Print an integer representing the discount amount for the given total bill
Constraints:
0<billAmount<=10^9
Example:
I/P:
2514795
O/P:
162
TEST CASE 1:
I/P:
572698
O/P:
336
TEST CASE 2:
I/P:
146153
O/P:
100
*/
public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price value");
		int num = sc.nextInt();
		int res, even = 0, odd = 0;
		while (num>=1) {
			res = num % 10;
			
			if (res % 2 == 0) 
				even = even + res; 
			  else  
				odd = odd + res;
		 
			num = num / 10;
		}
		System.out.println("Discount is equal to =" + (even * odd));
		sc.close();
	}

}
