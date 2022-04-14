import java.util.Scanner;

public class smallest_possible_whole_number {

	public static long solve(long n, long k) {
		 if(n<k)
		    {
		        return n;
		    }
		    return solve(n-k,k);
	}
 	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 while(T-->0) {
			 long N=sc.nextLong();
			 long K=sc.nextLong();
			 long ans=solve(N,K);
		        System.out.println(ans); 
		 }
sc.close();
 	}
 }
