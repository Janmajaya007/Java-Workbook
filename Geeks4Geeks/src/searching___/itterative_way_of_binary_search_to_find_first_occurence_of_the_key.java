package searching___;

import java.util.Arrays;
import java.util.Scanner;

public class itterative_way_of_binary_search_to_find_first_occurence_of_the_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int index = search(arr, n, k);
		System.out.println(index + " is the index of the search " + "element from the sorted arrat");
		sc.close();
	}

	private static int search(int[] arr, int size, int key) {
		// TODO Auto-generated method stub
		int l = 0, r = size - 1, mid;
		while (l <= r) {
			mid = (l + r) / 2;
			if (arr[mid] > key) {
				r = mid - 1;
			} else if (arr[mid] < key) {
				l = mid + 1;
			} else {
				if (mid == 0 || arr[mid] != arr[mid - 1]) {
					return mid;
				} else {
					r= mid -1;
				}
			}
		}
		return 0;
	}

}
