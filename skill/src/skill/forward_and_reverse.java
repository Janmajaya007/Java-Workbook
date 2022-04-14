package skill;

import java.util.Scanner;

public class forward_and_reverse {

	public static void main(String[] args) {
		 Scanner sc= new Scanner (System.in);
		System.out.println("Enter the M value");
		 int m=sc.nextInt();
			System.out.println("Enter the N value");
		 int n=sc.nextInt();
		 for (int i=m; i<n;i++)
		 {
			 System.out.println(i);
		 }
 System.out.println();
 System.out.println("Print in reverse order");
		 for (int j=n; j<m;j--)
		 {
			 System.out.println(j);
		 }
	}

}
