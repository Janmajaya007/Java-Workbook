package HackerRank;

import java.util.Scanner;

public class Divisible_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int pairs=divisible_Sum(arr, n, k);
System.out.println(pairs);
sc.close();
	}

	public static int divisible_Sum(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		int sum=0, count=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				sum=arr[i]+arr[j];
				if(sum%k==0) {
					count++;
				}
				sum=0;
			}
		}
		return count;
	}

}
