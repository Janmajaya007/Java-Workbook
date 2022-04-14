package company_specific_training_;

import java.util.Scanner;
/*
A company wishes to bucketize their item IDs for the better search operations. The bucket for the item ID is chosen on 
the basis of the maximum value of the digit in the item ID. Write an algorithm to find the bucket to which the item ID 
will be assigned.
INPUT:
The input consists of an integer item ID, representing the identity number of the item.
OUTPUT:
Print an integer representing the bucket to which the item ID will be assigned

Example:
I/P:
32387634
O/P:
8
EXPLANATION:
8 is the maximum digit value in the given item ID .So output is 8
*/
public class id_bucket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID");
		int id = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int digit;
		while (id >= 1) {
			digit = id % 10;
			if (digit > max)
				max = digit;

			id = id / 10;
		}
		System.out.println("The bucket number is" + max);
		sc.close();
	}

}
