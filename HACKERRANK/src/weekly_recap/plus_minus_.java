package weekly_recap;

import java.util.Scanner;

public class plus_minus_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]= new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	double p=0, ne=0, z=0;
	for(int i=0;i<n;i++){
	    if(arr[i]>0)
	    p++;
	    else if(arr[i]<0)
	    ne++;
	    else
	    z++;
	}
	double r1=(p/n);
	double r2=(ne/n);
	double r3=(z/n);
	System.out.println(String.format("%.6f", r1));
	System.out.println(String.format("%.6f", r2));
	System.out.println(String.format("%.6f", r3));
	}

}
