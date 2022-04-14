package Mathematics;

import java.util.Scanner;
 
public class factroial_trail_by_zero_ {
	private static int  trailingZero(int N) {
		// TODO Auto-generated method stub
		if (N<0)
			 return -1;
		 int trail=0;
		 for(int i=5;(N/i)>=1;i=i*5)
		 {
			 trail=trail+(N/i);
		 }
		 return trail;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the N");
		int n=s.nextInt();
		System.out.println(trailingZero(n));
		s.close();
	}

	
}
