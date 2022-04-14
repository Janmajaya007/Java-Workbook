package searching___;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter the array");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the element to search");
		int search = sc.nextInt();
		int index = binarySearch(arr, n, search);
		System.out.println(index);
		sc.close();

	}

	public static int binarySearch(int[] arr, int n, int search) {
		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == search)
				return mid;
			else if (arr[mid] < search) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
