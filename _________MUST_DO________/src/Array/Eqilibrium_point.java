package Array;
//Time complexity of this code is O(n^2)
import java.util.*;

public class Eqilibrium_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
 int result=equilibrium(arr,n);
 System.out.println(result);
	}

	private static int equilibrium(int[] arr, int n) {
		int p=0, sum1=0,sum2=0;
		while(p<n) {
			for(int i=0;i<p;i++) {
				sum1=sum1+arr[i];
			}
			for(int i=p+1;i<n;i++) {
				sum2=sum2+arr[i];
			}
			 if(sum1==sum2)
				return p+1;
			sum1=0;sum2=0;
			p++;
		}
		return -1;
	}
}
