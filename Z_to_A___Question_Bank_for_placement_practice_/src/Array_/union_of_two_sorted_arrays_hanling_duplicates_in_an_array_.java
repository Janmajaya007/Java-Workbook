package Array_;

/*
 * Handling duplicates in any of the array :
 * Below code does not handle duplicates in any of the array. 
 * To handle the duplicates, 
 * just check for every element whether adjacent elements are equal. 
 * 
 * here is the BUG to this code
 * Enter the size of array1
3
Declaring the array1 and giving inputs to it
1 2 2
Enter the size of array2
3
Declaring the array2 and giving inputs to it
2 3 3
2 
 */
import java.util.Scanner;

public class union_of_two_sorted_arrays_hanling_duplicates_in_an_array_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array1");
		int n1 = sc.nextInt();
		System.out.println("Declaring the array1 and giving inputs to it");
		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter the size of array2");
		int n2 = sc.nextInt();
		System.out.println("Declaring the array2 and giving inputs to it");
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}
		unionOfTwoArrays(arr1, n1, arr2, n2);

		sc.close();
	}

	public static void unionOfTwoArrays(int[] arr1, int n1, int[] arr2, int n2) {
		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			while ((i < (n1 - 1)) && (arr1[i] == arr1[i + 1])) {
				i++;
			}
			while ((j < (n2 - 1)) && (arr2[j] == arr2[j + 1])) {
				j++;
			}

			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
			} else if (arr1[i] > arr2[j]) {
				System.out.print(arr2[j] + " ");
				j++;
			}

			else {
				System.out.print(arr2[j] + " ");
				j++;
				i++;
			}
		}

		while (i < n1) {
			if ((i < (n1 - 1)) && (arr1[i] == arr1[i + 1]))  {
				i++;
			} else {
				System.out.print(arr1[i] + " ");
				i++;
			}
		}
		while (j < n2) {
			if ((j < (n2 - 1)) && (arr2[j] == arr2[j + 1])) {
				j++;
			} else {
				System.out.print(arr2[j] + " ");
				j++;
			}
		}
	}

}
