package rough__;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int k=sc.nextInt();
find(k,arr);
	}

	private static void find(int k, int[] arr) {
		// TODO Auto-generated method stub
		int c=0;
		for(int i=0;i<arr.length-1;i++ ) {
			if(arr[i]>arr[i+1]) {
				 while(arr[i]>arr[i+1]) {
					 arr[i+1]=arr[i+1]+k;
					 c++;
				 }
			}
		}
		System.out.println(c);
	}

}
