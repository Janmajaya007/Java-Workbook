package HackerRank;

import java.util.*;

public class migratory_bird_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array size");
int n=sc.nextInt();
System.out.println("Enter the array");
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
migratoryBird(arr, n);
//int result=migratoryBird(arr, n);
//System.out.println(result);

	}

	public static void migratoryBird(int[] arr, int n) {
		// TODO Auto-generated method stub
		int [] ar=new int[6];
		for(int i=0;i<n;i++) {
			ar[arr[i]]++;
		}
		int max=0;
		for(int i=0;i<=6;i++) {
			if(ar[i]>max)
				max=ar[i];
		}
		System.out.println(max);
		for(int i=0;i<=6;i++) {
			if(ar[i]==max) {
				//return i+1;
				System.out.println(i+1);
			break;
			}
		}
		//return -1;
	}

}
