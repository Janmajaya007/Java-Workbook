package Array_;

import java.util.Scanner;

public class find_max_and_min_from_array_ {

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

		int max = find_min_(arr, n);
		int min = find_max_(arr, n);
		System.out.print(
				"The maximuun value in the arrasy is (" + max + ") The maximuun value in the arrasy is (" + min + ") ");

		sc.close();
	}

	private static int find_min_(int[] arr, int n) {
		int max = arr[0];
		for (int ar : arr) {
			if (ar > max)
				max = ar;
		}
		return max;
	}

	private static int find_max_(int[] arr, int n) {
		int min = arr[0];
		for (int ar : arr) {
			if (ar < min)
				min = ar;
		}
		return min;
	}
}
