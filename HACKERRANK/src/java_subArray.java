 import java.io.*;
import java.util.*;

public class java_subArray {
	static void findsubarray(int arr [], int n) {
		//ArrayList<Integer> ar=new ArrayList<>();
		int c=0;
		for(int i=0;i<n;  i++){
            for(int j=0; j<n;  j++){
                if(i<=j) {
                	int aryy []=Arrays.copyOfRange(arr, i,j);
                	int sum= count(aryy);
                	if(sum<0)
                		c++;
                }
            }
        }
		System.out.println(c);
	}
    static int  count(int arr []) {
    	int sum=0;    
    	for(int i=0; i<arr.length-1; i++) {
    		sum+=arr[i];
    		 
    	}
    	 return sum;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr []= new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        findsubarray (arr ,   n);
       
        
    }
}