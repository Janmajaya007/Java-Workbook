package company_specific_training_;

import java.util.Scanner;
/*
A company is transmitting data to another server . The data is in the form of numbers . To secure the 
data during transmission ,they plan to obtain a security key that will be sent along with the data. 
The security key is identified as the count of the repeating digits in the data.

Write an algorithm to find the security key for the data.
INPUT:
The input consists of an integer data, representing the data to be transmitted.
OUTPUT:
Print an integer representing the security key for the given data.

Example:
I/P:
578378923
O/P:
3
EXPLANATION:
The repeated digits in the data are 7,8 and 3. So , the security key is 3.
TEST CASE 1:
I/P:
234567898
O/P
1
*/
public class security_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the data");
		int data=sc.nextInt();
		int index=0;
		int arr[]=new int[10];
		while(data>=1) {
			index=data%10;
			arr[index-1]++;
			data=data/10;
		}
		int count=0;
		for(int c:arr)
		{
			if(c>1)
				count++;
		}
		System.out.println("The security code is "+count);
		sc.close();

	}

}
