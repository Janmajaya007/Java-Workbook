import java.util.Scanner;

public class Sorting_Bubble_Sort {

	public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	// System.out.println("Enter the size of array");
	 //int n=sc.nextInt();
	 int arr [] = {3, 2 1};
	 /*for(int i=0; i<n; i++) {
		  arr[i]=sc.nextInt(n);
	 }*/
int p=countSwap(arr);
System.out.println("The number of swap is="+p);
	}

	 static int  countSwap(int[] arr) {
		 int count=0;
		for (int i = 0; i < arr.length; i++) {
		    
		    for (int j = 0; j < arr.length - 1; j++) {
		         
		        if (arr[j] > arr[j + 1]) {
		            swap(arr[j], arr[j + 1]);
		            count++;
		        }
		    }
		    
		}
		return count;
		
	}

	 static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp=0;
		temp=i;
		i=j;
		j=temp;
	}

}



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
    
 int swaps=0;
 for(int i=0; i<a.length; i++){
     for(int j=0; j<a.length-1; j++){
        if (a[j] > a[j + 1]) {
                 swaps++;
                    swap(a[j], a[j + 1]);
        }
     }
 }
  
 System.out.println("Array is sorted in "+swaps+" swaps.");
 System.out.println("First Element: "+ a[0]);
 System.out.println("Last Element: "+ a[a.length-1]);
    }
static void swap(int i, int j) {
        
        int temp=0;
        temp=i;
        i=j;
        j=temp;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
