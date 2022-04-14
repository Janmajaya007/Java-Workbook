package Array_;

import java.util.Arrays;
import java.util.Scanner;

public class find_kth_max_and_min_element_of_an_array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Declaring the array and giving inputs to it");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value of K");
		int k = sc.nextInt();
		int k_small = kth_small(arr, n, k);
		int k_large = kth_large(arr, n, k);
		System.out.println("The " + k + " smallest number in the array  is " + k_small);
		System.out.println("The " + k + " largest number in the array  is " + k_large);

	}

	private static int kth_large(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);

	
		return arr[(n - 1) - 1];
	}

	private static int kth_small(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		return arr[k - 1]; 
	}

}
