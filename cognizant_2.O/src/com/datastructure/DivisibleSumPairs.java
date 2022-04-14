package com.datastructure;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= sc.nextInt();
		System.out.println("Enter the value of K");
		int k=sc.nextInt();
		System.out.println("Enter the values of array");
		int arr[]= new int [n];
		
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
//		sc.nextLine();
		sc.close();
		int result=findCount(arr, k);
		System.out.println(result);
	}

	public static int findCount(int[] arr, int k) {
		// TODO Auto-generated method stub
		int count=0;
		 for(int i=0;i<arr.length-1;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 int sum = arr[i]+arr[j];
				 if(sum%k==0) {
					 count++;
				 }
			 }
		 }
		
		return count;
	}

}
