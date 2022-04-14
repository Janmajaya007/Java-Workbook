package find_duplicates_in_java_;

import java.util.Arrays;
import java.util.Scanner;

public class find_duplicates_from_sorted_array {
	
	private static int[] duplicate(int[] arr, int n) {
		Arrays.sort(arr);
		
		int ar[]= new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[i+1]) {
				
			}
		}
 		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr []=  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		 System.out.println(duplicate(arr, n));
		 sc.close();
	}

	
}
