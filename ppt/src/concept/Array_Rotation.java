package concept;

import java.util.Scanner;

public class Array_Rotation {
	 public static int [] arrr (int [] arr, int d, int n){
		 while(d-->0) {
			 int i;
			 int temp =arr[0];
			 for(i=0;i<n-1;i++) {
				 arr[i]=arr[i+1];
			 }
			 arr[i]=temp;
			 }
		return arr;
		 
	 }

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int d=sc.nextInt();
int arr[]=new int[n];
 for(int i=0;i<n;i++) {
	 arr[i]=sc.nextInt();
 }
 
 
 for(int j=0;j<n;j++) {
	 System.out.print(arr[j]);
 }
	}

}
