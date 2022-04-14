package union_and_intersection_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class masterClassOfUnionAndIntersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("               -: INFORMATION :-            ");
		System.out.println("--------------------------------------------");
		System.out.println("| if n=1 Union_of_UnsortedArray            |");
		System.out.println("| if n=2 Union_of_SortedArray              |");
		System.out.println("| if n=3 Intersection_of_UnsortedArray     |");
		System.out.println("| if n=4 Intersection_of_SortedArray       |");
		System.out.println("--------------------------------------------");
		System.out.println("| what you want to do with two arrays      |");
		System.out.println("| Enter the vale of N____?                 |");
		System.out.println("--------------------------------------------");
		int N=sc.nextInt();
		System.out.println();
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
		
		if(N==1) {
			unionUnsorted(arr1, n, arr2, m);
		}
		else if(N==2) {
			unionSorted(arr1, n, arr2, m);
		}
		else if(N==2) {
			IntersectionUnsorted(arr1, n, arr2, m);
		}
		else if(N==2) {
			IntersectionSorted(arr1, n, arr2, m);
		}
		sc.close();

	}
	private static void IntersectionSorted(int[] arr1, int n, int[] arr2, int m) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		List<Integer> arr = new ArrayList<>();
		while (i < n && j < m) {
			while (i < n - 1 && arr1[i] == arr1[i + 1]) {
				i++;
			}
			while (j < m - 1 && arr2[j] == arr2[j + 1]) {
				j++;
			}
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				arr.add(arr1[i]);
				i++;
				j++;
			}
		}
		System.out.print(arr + " ");

	}
	private static void IntersectionUnsorted(int[] arr1, int n, int[] arr2, int m) {
		// TODO Auto-generated method stub
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
	private static void unionSorted(int[] arr1, int n, int[] arr2, int m) {
		// TODO Auto-generated method stub
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
	private static void unionUnsorted(int[] arr1, int n, int[] arr2, int m) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		Set<Integer> union = new HashSet<Integer>();
		while (i < arr1.length)
			union.add(arr1[i++]);
		while (j < arr2.length)
			union.add(arr2[j++]);
		System.out.println(union);
	}

}
