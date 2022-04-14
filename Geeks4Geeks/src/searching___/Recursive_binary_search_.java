package searching___;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive_binary_search_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The sorted array is");
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
		System.out.println();
		System.out.println("Enter the element to search from the array");
		int k = sc.nextInt();
		int start = 0, end = n - 1;
		int index = search(arr, start, end, k);
		System.out.println(index + " is the index of the search "
				+ "element from the sorted arrat");

	}

	public static int search(int[] arr, int start, int end, int element) {

		int mid = (start + end) / 2;
		if(start>end) {
			return -1;
		}
		
		if (arr[mid] == element) {
			return mid;
		} else if (arr[mid] < element) {
			return search(arr, mid + 1, end, element);
		} else
			return search(arr, start, mid - 1, element);
	}

}
