package Array_;

import java.util.Scanner;

public class kadanes_algorithm_ {
	/*
	 * Given an array arr of N integers. 
	 * Find the contiguous sub-array with maximum
	 * sum.
	 */
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
		int maxValue = maximumSubArray(arr, n);
		System.out.println(maxValue);
		sc.close();

	}

	public static int maximumSubArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		int sum = 0, max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			if (sum < arr[i])
				sum = arr[i];

			if (max < sum)
				max = sum;
		}
		return max;
	}

}
