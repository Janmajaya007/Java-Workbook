package february_long_challange_2021;

 
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class maximise_function_2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
 
		 int N=sc.nextInt();
	 
		 
		 while( N-->=0) {
              
			 int n=sc.nextInt();
			 
			 int arr[]=new int[n];
			  
			 for(int i=0;i<n;i++) {
				 arr[i]=sc.nextInt();
			 }
			 Arrays.sort(arr);
		 int sum=0;
			 for(int i=0;i< 1;i++) {
				 sum=(Math.abs(arr[i]-arr[i+1]))+(Math.abs(arr[i+1]-arr[arr.length-1]))+(Math.abs(arr[arr.length-1]-arr[i]));
				  
			 }
			System.out.println();
		       System.out.println(sum);
		      
		  }
		 sc.close();
		 }

	 
	
		 
		 
	}

