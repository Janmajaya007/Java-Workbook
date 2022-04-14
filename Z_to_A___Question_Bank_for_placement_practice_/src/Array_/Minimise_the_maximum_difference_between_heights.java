package Array_;

import java.util.Scanner;

public class Minimise_the_maximum_difference_between_heights {

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

		System.out.println("Enter the value of K");
		int k = sc.nextInt();

		findHeight(arr, n, k);
	}

	private static void findHeight(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		int diff, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > k)
				arr[i] = arr[i] - k;
			else if (arr[i] < k)
				arr[i] = arr[i] + k;
			else if (arr[i] == k)
				arr[i] = arr[i] + k;
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		for (int ar : arr) {
			if (ar > max)
				max = ar;
			if (ar < min)
				min = ar;
		}
		System.out.println(max + "  " + min);
		System.out.println(max-min);
	}

}
