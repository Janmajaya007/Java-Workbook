package rough__;

import java.util.Scanner;

public class test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	}

int q=sc.nextInt();
int ar[]=new int[q];
int arrr[]=new int[q];
for(int i=0;i<q;i++) {
	ar[i]=sc.nextInt();
}
  int sum=0;
  for(int j=0;j<q;j++) {
for(int i=0;i<n;i++) {
	sum=sum+arr[i];
	if(ar[i]<=sum) {
		arrr[j]=i+1;
	}
}
sum=0;
  }
  
  for(int k:arrr) {
	  System.out.print(k+" ");
  }
	}
}
