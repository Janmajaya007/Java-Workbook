package Array_;

import java.util.Scanner;

public class Reverse_the_array_ {

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
		reverse(arr, n);
         System.out.println("The reverse array is here");
		for (int ar : arr)
			System.out.print(ar + " ");
		sc.close();
	}

	private static void reverse(int[] arr, int n) {
		int begin = 0, end = arr.length - 1, temp = 0;
		while (end >= begin) {
			temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp;
			begin++;
			end--;
		}

	}

}
