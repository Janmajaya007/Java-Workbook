package searching___;

import java.util.Arrays;
import java.util.Scanner;

public class search_the_occurence_of_number_in_the_array_ {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array");
		 int n=sc.nextInt();
		 System.out.println("Enter the array");
		 int arr[]=new int[n];
		 for(int i=0; i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 Arrays.sort(arr);
		 System.out.println("Enter the element to search");
		 int search=sc.nextInt(), flag=0;
		 for(int i=0; i<n;i++) {
			 if(arr[i]==search) {
				 System.out.println(i);
				 flag++;
				 break;
			 }
		 }
		 if(flag==0)
			 System.out.println(-1);
		 
	}

}
