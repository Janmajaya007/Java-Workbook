package union_and_intersection_;

import java.util.*;

public class intersection_of_two_unsorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		IntersectionUnsorted(arr1, n, arr2, m);
		sc.close();
	}

	private static void IntersectionUnsorted(int[] arr1, int n, int[] arr2, int m) {
		 List<Integer> check=new ArrayList<Integer>();
		 List<Integer> finalList =new ArrayList<Integer>();
		 int i=0,j=0;
		 while(i<n)
		 {
			 check.add(arr1[i]);
		 i++;
		 }
		 
		 while(j<m)
		 {
			 if(check.contains(arr2[j]))
			 {
				 finalList.add(arr2[j]);
			 }
		 j++;
		 }
		 
		 System.out.print(finalList+" ");
		
	}

}
