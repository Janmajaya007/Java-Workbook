package rough__;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ar[]=reverseArray(arr);
		for(int k:ar) {
			System.out.print(k+" ");
		}
	}

	private static int [] reverseArray(int[] arr) {
		int i, temp, originalLength=arr.length;
		int len=originalLength;
		for(i=0;i<=originalLength/2;i++) {
			temp=arr[len-1];
			arr[len-1]=arr[i];
			arr[i]=temp;
			len-=1;
		}
		return arr;
		 
		
	}

}
