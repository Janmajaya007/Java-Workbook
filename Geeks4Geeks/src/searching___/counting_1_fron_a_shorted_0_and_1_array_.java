package searching___;

import java.util.Scanner;

public class counting_1_fron_a_shorted_0_and_1_array_ {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the array size");
		 int n=sc.nextInt();
		 int arr[]= new int[n];
		 System.out.println("Enter the array elements");
		 for(int i=0;i<n; i++) {
			 arr[i]=sc.nextInt();
		 }
		int num= count(arr, n);
		System.out.println("The number of 1 in the array is "+num);
		 sc.close();

	}

	private static int count(int[] arr, int n) {
		// TODO Auto-generated method stub
		int low=0;int high=n ;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==0)
			{
				low =mid+1;
			}
			else if(arr[mid]==1) {
				if(mid==0 || arr[mid]!=arr[mid-1])
					return n-mid;
				else
					high=mid-1;
			}
		}
		return 0; 
	}

}
