import java.util.Scanner;

public class array_rotation {
	static void leftRotate(int arr[], int d, int n) 
    { 
		int i, temp; 
		while(d-->0) {
	    temp = arr[0]; 
	    for (i = 0; i < n - 1; i++) 
	        arr[i] = arr[i + 1]; 
	    arr[i] = temp; 
		}
		
		
		 for (int j = 0; j < n; j++) 
	          System.out.print(arr[j] + " "); 
    }
	
	
   
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 int d=sc.nextInt();
		 int arr[]= new int [n];
		 for(int i=0; i<n; i++) {
			 arr[i]=sc.nextInt();
		 }
		 leftRotate(arr, d, n); 
	      
		  
	}
	}

 
