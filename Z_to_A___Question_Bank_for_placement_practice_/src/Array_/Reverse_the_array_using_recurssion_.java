package Array_;

import java.util.Scanner;

public class Reverse_the_array_using_recurssion_ {

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
		int begin = 0;
		reverse(arr, begin = 0, n - 1);
		System.out.println("The reverse array is here");
		for (int ar : arr)
			System.out.print(ar + " ");
		sc.close();
	}

	private static void reverse(int[] arr, int start, int len) {
		int temp = 0;
		while (len < start)
			return;

		temp = arr[start];
		arr[start] = arr[len];
		arr[len] = temp;
		reverse(arr, start + 1, len - 1);

	}

}
