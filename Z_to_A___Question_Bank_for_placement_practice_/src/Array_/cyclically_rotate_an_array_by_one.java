package Array_;

import java.util.Scanner;

public class cyclically_rotate_an_array_by_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array1");
		int n = sc.nextInt();
		System.out.println("Declaring the array1 and giving inputs to it");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
          cylinderRotation(arr, n);
	}

	private static void cylinderRotation(int[] arr, int n) {
		// TODO Auto-generated method stub
		int temp=arr[n-1], i;
		for(  i=n-1; i>=1; i--) {
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
		for(int ar:arr)
			System.out.print(ar+" ");
		
	}

}
