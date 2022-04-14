package find_duplicates_in_java_;

import java.util.ArrayList;
import java.util.Scanner;

/*
 QUESTION_
 Given an array of integers 1<=arr[i[<=n (n=size of array), some elements appear twice and other appear once. Find all the elements
 that appear twice in the array.
 could you do it without extra space and in O(n) runtime  ? 
 
 Amazon
 facebook
 */

public class find_duplicates_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr []=  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		 System.out.println(theduplicates(arr, n));
		 sc.close();

	}

	private static ArrayList<Integer> theduplicates(int[] arr, int n) {
	 ArrayList<Integer> duplicate= new ArrayList<>();
	 for(int N: arr) {
		 N=Math.abs(N);
		 if(arr[N-1]>=0) {
			 arr[N-1]*=-1;
		 }
		 else
		 {
			 duplicate.add(N);
		 }
	 }
		return duplicate;
	}

}
