import java.util.Arrays;
import java.util.Scanner;

public class maximum_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int  t=sc.nextInt();
		 while(t-->0) {
			 int sum=0;
			 int n=sc.nextInt();
			 int arr[]= new int [n];
			 for(int i=0;i<n;i++) {
				 arr[i]=sc.nextInt();
			 }
			 Arrays.sort(arr);
			 System.out.println((arr[n-1]*arr[n-2])+(arr[n-1]-arr[n-2]));
		 }
		 sc.close();
	}

}
