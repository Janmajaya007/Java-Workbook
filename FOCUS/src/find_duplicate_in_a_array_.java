import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class find_duplicate_in_a_array_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		System.out.println("Enter the array");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(findDuplicates(arr, n));

	}

	private static ArrayList<Integer> findDuplicates(int[] arr, int n) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<>();
//		int j;
//		for (int i = 0; i < n; i++) {
//			j = Math.abs(arr[i]);
//			if (arr[j] >= 0)
//				arr[j] = -arr[j];
//			else
//				ar.add(j);
// 		}
		for (int i = 0; i < arr.length; i++) {
			arr[arr[i] % arr.length]
				= arr[arr[i] % arr.length]
				+ arr.length;
		}
	//	System.out.println("The repeating elements are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= arr.length * 2) {
				ar.add(i);
			}
		}
		//Collections.sort(ar);
		if(ar.size()==0) {
			ar.add(-1);
			return ar;
		}
		
		return ar;
	}

}
