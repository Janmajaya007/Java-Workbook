package union_and_intersection_;
import java.util.*;
public class union_of_unsorted_array_ {
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
		unionUnsorted(arr1, n, arr2, m);
		sc.close();
	}
	public static void unionUnsorted(int[] arr1, int n, int[] arr2, int m) {
		int i = 0, j = 0;
		Set<Integer> union = new HashSet<Integer>();
		while (i < arr1.length)
			union.add(arr1[i++]);
		while (j < arr2.length)
			union.add(arr2[j++]);
		System.out.println(union);
	}
}
