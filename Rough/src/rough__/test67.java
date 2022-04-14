package rough__;

import java.util.*;

public class test67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int n=sc.nextInt();
magicNumber(n,a,b);
	}

	public static void magicNumber(int n, int a, int b) {
		// TODO Auto-generated method stub
		int arr[]=new int[n];
		int eve[]=new int[n/2];
		int odd[]=new int[n/2];
		int k=0,l=0;
		arr[0]=a;
		arr[1]=b;
		for(int i=2;i<n;i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0)
			 eve[k]=arr[i];
		}
		System.out.println();
		for(int j=0;j<n;j++) {
			if(arr[j]%2==1)
			System.out.print(arr[j]+" ");
		} 
	}
}
