package com.datastructure;

import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n = sc.nextInt();
		System.out.println("Enter the size of second array");
		int m = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		// input to first array
		System.out.println("Give input for first array array1[]");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		// input to second array
		System.out.println("Give input for second array array2[]");
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		sc.close();
		int result = betweenTwoSets(arr1, arr2);
		System.out.println(result);

	}

	public static int betweenTwoSets(int[] arr1, int[] arr2) {

		int count = 0;

		// find LCM of first array array1[]
		int lcm = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			lcm = getLcm(lcm, arr1[i]);
		}

		// find HCF of second array array2[]
		int hcf = arr2[0];
		for (int i = 0; i < arr2.length; i++) {
			hcf = getHcf(hcf, arr2[i]);
		}

		// getting the output
		int multiple = 0;
		while (multiple <= hcf) {
			multiple += lcm;

			if (hcf % multiple == 0) {
				count++;
			}
		}
		return count;
	}

	public static int getHcf(int a, int b) {
		if (b == 0) {
			return a;
		}
		return getHcf(b, (a % b));
	}

	public static int getLcm(int a, int b) {

		return (a / getHcf(a, b)) * b;
	}

}
