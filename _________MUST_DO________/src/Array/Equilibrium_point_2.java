package Array;

import java.util.Scanner;

public class Equilibrium_point_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int point = equipoint(arr, n);
		System.out.println(point);
	}

	private static int equipoint(int[] arr, int n) {
		// TODO Auto-generated method stub
		int rightsum = 0, leftsum = 0;
		for (int i = 0; i < n; i++) {
			rightsum += arr[i];
		}

		for (int i = 0; i < n; i++) {
			rightsum = rightsum - arr[i];

			if (rightsum == leftsum) {
				return i + 1;
			}

			leftsum = leftsum + arr[i];
		}
		return -1;
	}

}
