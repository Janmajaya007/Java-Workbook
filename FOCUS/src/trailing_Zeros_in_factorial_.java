import java.util.*;
public class trailing_Zeros_in_factorial_ {
	public static int trailingZero(int n) {
		// TODO Auto-generated method stub
		 if (n<0)
			 return -1;
		 int trail=0;
		 for(int i=5;(n/i)>=1;i=i*5)
		 {
			 trail=trail+(n/i);
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
