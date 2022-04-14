package Array_;

import java.util.Scanner;

public class Move_all_the_negative_elements_to_left_and_positive_to_right {

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
		moveNegative(arr, n);
		for (int ar : arr) {
			System.out.print(ar + " ");
		}
	}

	public static void moveNegative(int[] arr, int n) {
		// TODO Auto-generated method stub
		int j = 0, temp;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}
}
