

import java.util.Scanner;

public class find_maximu_element_in_an_array_without_binary_search {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Array size");
		 int n=sc.nextInt();
		 System.out.println("Here enter your array elements");
		 int arr[]=new int [n];
		 for(int i=0; i<n; i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 findMaximum(arr, n);
		 sc.close();

	}

	private static void findMaximum(int[] arr, int n) {
		int count=1, cMax=0; 
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[ cMax ]) {
				count++;
				 
			}
			else {
				count--;
			}
			if(count==0) {
				count=1;
				cMax= i ;
			}
		}
		int c=0 , max= arr[cMax];
		for(int ar:arr) {
			if(ar==max)
				c++;
		}
		 if(c>(n/2))
			 System.out.println("the maximum element is "+ max);
		 else
			 System.out.println("There is no maximum element");
	}

}
