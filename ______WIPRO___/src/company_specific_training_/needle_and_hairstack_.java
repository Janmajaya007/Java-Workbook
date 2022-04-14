package company_specific_training_;

/*
 * Write an algorithm  to find the number of occurrences of needle in given positive number haystack.
Input
The first line of the input consists of an integer needle, representing a digit. The second
line consists of an integer haystack, representing the positive number.
Output
Print an integer representing the number of occurrences of needle in haystack.
Constraints
0<_needle<_9
0<_haystack<_99999999
Example
Input:

2 -> needle
123228 -> haystack 
Output:
3


5 
5555656 


6==5    
5==5  1 
6==5 
5==5 2 
5==5 3 
5==5 4 
5==5 5 

 */
import java.util.Scanner;

public class needle_and_hairstack_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the needle value");
		int n = sc.nextInt();
		System.out.println("Enter the HAir stack");
		int h = sc.nextInt();
		int r, c = 0;
		while (h >= 1) {
			r = h % 10;
			if (r == n) {
				c++;
			}
			h = h / 10;
		}
		System.out.println("The occurence of needle in the hairstack is " + c);
	}

}
