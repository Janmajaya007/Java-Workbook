package sorting;

import java.util.*;

public class selection_sort_ {

	public static final int INF = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		System.out.println("Enter the array");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp=0; 
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++)  
				if (arr[j] < arr[min])
					min = j;
			 
			temp  = arr[min];
			arr[min] =arr[i] ;
			arr[i]=temp;
		}
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = temp[i];
//		}

		for (int s : arr)
			System.out.print(s + " ");
	}
}
