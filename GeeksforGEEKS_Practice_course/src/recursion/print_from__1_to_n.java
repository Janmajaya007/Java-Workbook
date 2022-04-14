package recursion;

import java.util.Scanner;



public class print_from__1_to_n {

	
	private static void  print(int n) {
		 while(n==0) {
			 return;
		 }
		
		 print(n-1);
		
		 System.out.print(n+" ");
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
		sc.close();
	}

}
