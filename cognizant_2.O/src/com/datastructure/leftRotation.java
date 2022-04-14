package com.datastructure;

import java.util.*;

public class leftRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> arr = new ArrayList<>();

		System.out.println("ENTER THE LIST SIZE_____");
		int n = sc.nextInt();
		System.out.println("ENTER THE NO OF ROTATION");
		int d = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			arr.add(input);
		}

		List<Integer> a = leftrotation(arr, d);
		System.out.println(a);
	}

	private static List<Integer> leftrotation(List<Integer> arr, int d) {
		// Integer[] a = arr.toArray(new Integer[0]);
		List<Integer> result = new ArrayList<>();
		int j = d;
		while (j < arr.size()) {
			result.add(arr.get(j));
			j++;
		}
		j=0;
		while(j<d) {
			result.add(arr.get(j));
			j++;
		}
		return result;
	}

}
