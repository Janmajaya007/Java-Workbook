package ppt;

import java.util.Scanner;

public class q3 {
// Accept M and N print from M to N forward and reverse
	
	
	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		 System.out.println(" Enter the M value");
		 int m=scan.nextInt();
		 System.out.println(" Enter the N value");
		 int n=scan.nextInt();
		 
		 if(m>n) {
			 System.out.println("Print the digits from M to N");
			 for (int i=m; i>=n; i--)
				 System.out.print("  "+i);
			 System.out.println();
			 System.out.println("print the digits from N to M");
             for (int i=n; i<=m; i++)
            	 System.out.print("  "+i);
		 }
		 else {
			 System.out.println("Print the digits from M to N");
			 for (int i=m; i<=n; i++)
				 System.out.print("  "+i);
			 System.out.println();
			 System.out.println("print the digits from N to M");
             for (int i=n; i>=m; i--)
            	 System.out.print("  "+i);
            	 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 
	}

}
