package com.datastructure;

import java.util.Scanner;

public class arrays_hourGlassSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array___");
		System.out.println("Enter the rowCount");
		int row = sc.nextInt();
		System.out.println("Enter the columnCount");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= row - 3; i++) {
			for (int j = 0; j <= col - 3; j++) {
				sum += (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2]);
				
				if (sum > max)
					max = sum;
				sum = 0;
			}
		}
		System.out.println(max);
	}
}
