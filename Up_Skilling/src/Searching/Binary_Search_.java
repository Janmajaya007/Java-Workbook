package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_ {
	private static int  BinarySearh(int[] arr, int l, int r, int x) {
		if(r<=1) {
		int mid=(l+(r-l))/2;
		 if(arr[mid]==x)
			// System.out.println("Index value of "+x+"is "+mid);
		 
		 if(arr[mid]>x)
			 return BinarySearh(arr, l, mid-1, x);
		 else
			 return BinarySearh(arr, mid+1, r, x);
		}
		return -1;
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array Size");
int n=sc.nextInt();
System.out.println("Input the Array");
int [] arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
System.out.println("Enter the element to search from the array");
int x=sc.nextInt();
Arrays.sort(arr);
BinarySearh(arr, 0, n-1, x);

	}

	
}
