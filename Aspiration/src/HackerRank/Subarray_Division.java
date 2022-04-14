package HackerRank;

import java.util.Scanner;

public class Subarray_Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int d=sc.nextInt();
int m=sc.nextInt();
int ways=subarry(arr, n, d, m);
System.out.println(ways);
sc.close();
	}

	public static int subarry(int[] arr, int n, int d, int m) {
		// TODO Auto-generated method stub
		int count=0, sum=0;
		for(int i=0;i<m;i++) {
			sum=sum+arr[i];
		}
		if(sum==d)
			count++;
		for(int i=m;i<n;i++) {
			sum=sum+arr[i]-arr[i-m];
			if(sum==d)
				count++;
		}
		return count;
	}

}
