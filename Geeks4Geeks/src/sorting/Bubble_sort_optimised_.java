package sorting;

import java.util.Scanner;

public class Bubble_sort_optimised_ {
	/*
	 * Here in the optimisation of code I have taken one marker to check is swap is
	 * happen or not if swap is not happen then the array got sorted so there is no
	 * need to traverse the array again and again.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		System.out.println("Input the array elements");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Now the sorted array is");
		System.out.println();

		for (int i = 0; i < n - 1; i++) {
			boolean swap = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}
			if (swap = false) {
				break;
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}
