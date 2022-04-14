import java.util.Scanner;

public class nCr {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 long n=sc.nextInt();
		 long r=sc.nextInt();
		 long p=0;
		 p=fact(n)/(fact(r)*fact(n-r));
		 System.out.println(p);
sc.close();
	}

	public static long fact(long r) {
		long f=1;
		if(r>0) {
			while(r>1) {
				f*=r--;
			}
			return f;
		}
		
 		return f;
	}

}
