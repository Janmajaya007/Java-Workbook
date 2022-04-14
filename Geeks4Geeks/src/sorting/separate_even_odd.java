package sorting;

import java.util.Scanner;

public class separate_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		separateEvenOdd(arr, n);
		sc.close();
	}

	private static void separateEvenOdd(int[] arr, int n) {
		// TODO Auto-generated method stub
		int j = 0, temp = 0, i = 0;
		while (i < n) {
			if (arr[i] % 2 == 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
				i++;
			} else {
				i++;
			}
		}

		for (int ar : arr) {
			System.out.print(ar + " ");
		}

	}

}
