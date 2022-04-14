package company_specific_training_;

/*
 * A company wishes to provide cab service for their N employees.The employees have IDs ranging
from 0 to N-1. The company has calculated the total distance from an employee’s residance to the
company,considering the path to be followed by the cab is a stright path.The distance of the 
company from itself is 0.The distance for the employees who live to the left side of the company 
is represented with a negative sign.The distance for the employees who live to the right side of
the company is represented with a positive sign.The cab will be alloted a range of distance.The 
company wishes to find the IDs of the employees who live within the particular distance range.
 
Write an algoritham to find the employee IDs who live within the distance range.


20 30    35 


Input
The first line of the input consists of three space-separated integers-num,start and
representing the size of the list (N);the starting value of the range,and the ending
value of the range,respectively.
The second line of the input consists of N space-separated integers representing the
distance of the employees from the company.

Output
Print space-separated integers representing the 
IDs of the employees whose distance
lies within the given range else return-1.
Example
Input
6 30 50
29 38 12 48 39 55

Output
38 48 39



8 34 58 
12 35 67 89 56 45 120 55

o/p: 
35 56 45 55 

 */
import java.util.Scanner;

public class cab_facility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of employees");
		int n = sc.nextInt();
		System.out.println("Input the low range ");
		int l = sc.nextInt();
		System.out.println("input the high range");
		int h = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the distance of employees from the office");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The distance range of employee own a cab according is ");
		for (int i = 0; i < n; i++) {
			if (arr[i] >= l && arr[i] <= h) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

}
