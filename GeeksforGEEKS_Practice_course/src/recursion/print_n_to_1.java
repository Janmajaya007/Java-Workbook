package recursion;

import java.util.Scanner;

public class print_n_to_1 {

	
	private static void print(int n) {
		 while(n==0) {
			 return;
		 }
		 System.out.print(n+" ");
		 print(n-1);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.close();
print(n);
	}

	

}
