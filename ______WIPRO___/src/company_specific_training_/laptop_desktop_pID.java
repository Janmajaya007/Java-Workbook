package company_specific_training_;

/*
 * A company Digicomparts  manufactures 52 types of unique products for laptop and desktop computers.
It manufactures 10 types of laptop products and 42 types of desktop products.
Each product manufactured by the company has a unique product ID from a-z and A-Z. The laptop
products have product IDs(a,i,e,o,u,A,I,E,O,U) while the rest of the product IDs are assigned 
to the desktop products. The company manager wishes to find the sales data for the desktop 
products.

Given a list of product IDs of the sales of the last N products. Write an algorithm to help the
manager find the product IDs of the desktop products.
Input
The first line of the input consists of an integer numOfproducts, representing the number of 
products to be considered in the sales data(N).
The second line consists of N space-separated characters-prodID1,prodID2….,prodIDN representing
the productIDs of the sales of the last N products.
Output
Print an integer representing the number of desktop products among the given sales data.
Constraints
0<_numOfProducts<_106
Example
Input
6
A v I k e l  =>  v k l 
Output
3


 */
import java.util.Scanner;

public class laptop_desktop_pID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Products");
		int n = sc.nextInt();
		System.out.println("Enter the product ID");
		char[] arr = new char[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next().charAt(0);
		}
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A'
					|| arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')
				c++;
		}
		int desk = n - c;
		System.out.println("The number of Desktop is " + desk);
	}

}
