package Array_;

import java.util.Scanner;

/*
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order
 * Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
 */
public class Method2_short_0_1_2_array_in_ascending_order_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Declaring the array and giving inputs to it");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr, n);
 for(int ar: arr) {
	 System.out.print(ar+" ");
 }
	}

	public static void sort(int[] arr, int n) {
		// TODO Auto-generated method stub
		int i, c0 = 0, c1 = 0, c2 = 0;
		 
		for ( i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				c0=c0+1;
			}
			if (arr[i] == 1) {
				c1=c1+1;
			}
			if (arr[i] == 2) {
				c2=c2+1;
			}
		}
    i=0;
    while(c0>0) {
    	arr[i]=0;
    	i=i+1;
    	c0=c0-1;
    }
    while(c1>0) {
    	arr[i]=1;
    	i=i+1;
    	c1=c1-1;
    }
    while(c2>0) {
    	arr[i]=2;
    	i++;
    	c2--;
    }
	}

}
