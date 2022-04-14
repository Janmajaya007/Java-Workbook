package sorting;

import java.util.*;

public class Bubble_sort_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		System.out.println("Input the array elements");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Now the sorted array is");
		System.out.println();
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n -i- 1; j++) {
				if (arr[j] > arr[j + 1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}

	}

}
