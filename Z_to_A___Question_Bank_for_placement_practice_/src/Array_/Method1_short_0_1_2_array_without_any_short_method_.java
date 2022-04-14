package Array_;

import java.util.Scanner;

/*
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order
 * Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
 */
public class Method1_short_0_1_2_array_without_any_short_method_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Declaring the array and giving inputs to it");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr, n);
		for (int ar : arr) {
			System.out.print(ar + " ");
		}
		sc.close();
	}

	public static void sort(int[] arr, int n) {

		int start = 0, mid = 0, end = n - 1, temp = 0;
		while (mid <= end) {
			if (arr[mid] == 0) {
				temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				start = start + 1;
				mid = mid + 1;
				continue;
			}
			if (arr[mid] == 1) {
				mid = mid + 1;
				continue;
			}
			if (arr[mid] == 2) {

				temp = arr[mid];
				arr[mid] = arr[end];
				arr[end] = temp;
				end = end - 1;
				continue;
			}
		}

	}

}
