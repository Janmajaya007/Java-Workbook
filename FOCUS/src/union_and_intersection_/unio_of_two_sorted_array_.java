package union_and_intersection_;
import java.util.*;
public class unio_of_two_sorted_array_ {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("Enter the arr1");
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter m");
		int m = sc.nextInt();
		System.out.println("Enter the arr2");
		int arr2[] = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		unionSorted(arr1, n, arr2, m);
		sc.close();
	}
private static void unionSorted(int[] arr1, int n, int[] arr2, int m) {
		int i = 0, j = 0;
		List<Integer> arr = new ArrayList<Integer>();
		while (i < n && j < m) {
			while ((i < n - 1) && (arr1[i] == arr1[i + 1])) {
				i++;
			}
			while ((j < m - 1) && (arr2[j] == arr2[j + 1])) {
				j++;
			}
 			if (arr1[i] < arr2[j]) {
				arr.add(arr1[i++]);
			} else if (arr1[i] > arr2[j]) {
				arr.add(arr2[j++]);
			} else {
				arr.add(arr1[i]);
				i++;
				j++;
			}
		}
 		while (i < n) {
			if ((i < (n - 1)) && (arr1[i] == arr1[i + 1])) {
				i++;
			} else {
				arr.add(arr1[i++]);
			}
		}
 		while (j < m) {
			if ((j < (m - 1)) && (arr2[j] == arr2[j + 1])) {
				j++;
			} else {
				arr.add(arr2[j++]);
			}
		}
		System.out.print(arr + " ");
	}
}
