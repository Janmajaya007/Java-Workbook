package rough__;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ar[] = sortArray(arr);
		for (int k : ar) {
			System.out.print(k + " ");
		}
	}

	public static int[] sortArray(int[] arr) {
		// TODO Auto-generated method stub
		int i, max, location, j, temp, len = arr.length;
		for (i = 0; i < len; i++) {
			max = arr[i];
			location = i;
			for (j = i; j < len; j++) {
				if (max > arr[j]) {
					max = arr[j];
					location = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[location];
			arr[location] = temp;
		}
		return arr;
	}
}
