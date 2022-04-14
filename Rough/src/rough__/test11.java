package rough__;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int p=0, sum1=0,sum2=0;
		while(p<n) {
			for(int i=0;i<p;i++) {
				sum1=sum1+arr[i];
			}
			for(int i=p+1;i<n;i++) {
				sum2=sum2+arr[i];
			}
			 if(sum1==sum2)
				 System.out.println(p+1);
			sum1=0;sum2=0;
			p++;
		}
	}
}
