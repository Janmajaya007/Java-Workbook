package Array____;

import java.util.Scanner;

public class Even_odd_separation___ {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the array size");
		 int n=sc.nextInt();
		 System.out.println("Eneter the array");
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 evenOddSeparation(arr, n);
		 sc.close();
     
	}

	private static void evenOddSeparation(int[] arr, int n) {
		// int even=0, odd=1, temp=0;
		 /*while(odd<n) {
			 if(arr[even]%2==0) {
				 even++;
				 
			 }
			 else if(arr[odd]%2==0) {
				 temp=arr[odd];
				 arr[odd++]=arr[even];
				 arr[even++]=temp;
				  
			 }
			 else {
				 odd++;
			 }
		 }*/
		 
		 int nextEven = 0, nextOdd = arr.length - 1;
		 while (nextEven < nextOdd) {
		 if (arr[nextEven] % 2 == 0) {
		 nextEven++;
		 }
		 else {
		 int temp = arr[nextEven];
		 arr[nextEven] = arr[nextOdd];
		 arr[nextOdd--] = temp;
		 }
		 }
		for(int ar: arr) {
			System.out.print(ar+" ");
		}
	}

}
