package ppt;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		
		//q1_Print all the digit from 1 to n
		
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number");
		   int N= sc.nextInt();
		   
		   for (int i=1; i<=N; i++) {
			  System.out.print("  "+i);
		   }
	}

}
