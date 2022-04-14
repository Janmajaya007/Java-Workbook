package searching___;

import java.util.Arrays;
import java.util.Scanner;

public class recusive_binary_search_for_finding_first_occurence_of_the_element_ {

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
		for (int ar : arr) {
			System.out.print(ar + " ");
		}
		System.out.println();
		System.out.println("Enter the element to search from the array");
		int k = sc.nextInt();
		int start = 0, end = n - 1;
		int index = search(arr, start, end, k);
		System.out.println(index + " is the index of the search " + "element from the sorted arrat");
		sc.close();
	}

	private static int search(int[] arr, int start, int end, int element) {
		// TODO Auto-generated method stub
		int mid = (start + end) / 2;
		if (start > end) {
			return -1;
		}
		if (arr[mid] < element) {
			return search(arr, mid + 1, end, element);
		} else if (arr[mid] > element)
			return search(arr, start, mid - 1, element);

		else {
			if (mid == 0 || arr[mid] != arr[mid - 1])
				return mid;
			else
				return search(arr, start, mid - 1, element);
		}

	}
}
