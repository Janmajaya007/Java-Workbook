package skill;

import java.util.Scanner;

public class array_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner  sc = new Scanner(System.in);
       System.out.println("Enter the Size of array");
       int n=sc.nextInt();
       int arr[]= new int[n];
       System.out.println("Give the input to the array");
       for(int j=0; j<n; j++) {
    	   arr[j]=sc.nextInt();
       }
       System.out.println("The array elements are following");
       for(int i=0; i<arr.length; i++) {
       System.out.println(arr[i]);
       }
	}

}
