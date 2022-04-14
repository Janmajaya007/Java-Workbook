package february_long_challange_2021;

import java.util.Scanner;

public class maximise_function {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int N=sc.nextInt();
		 
		 while(N-->=0) {
		   
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 
		 for(int l=0; l<n;l++) {
			 arr[l]=sc.nextInt();
		 }
		 
		 int sum=0; int max=0;
		 
		 for (int i=0;i<n;i++) {
			 for(int j=0;j<n;j++) {
				 for(int k=0;k<n;k++) {
					 sum=(Math.abs(arr[i]-arr[j]))+ (Math.abs(arr[j]-arr[k]))+(Math.abs(arr[k]-arr[i]));
					 if(sum>max) {
						 max=sum;
					 }
				 }
			 }
		 }
System.out.println(max);
	}
	}
}
    // here in this programming some bugs are there 
/*3
3
2 7 5
3
3 3 3
5
2 2 2 2 5*/
//here the expected output should be 
/*
10
0
6
*/ 
//But the last output does not show its result