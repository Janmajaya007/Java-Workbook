import java.util.Scanner;

public class Nth_fibonaci_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the N value");
        long n=sc.nextLong();
        sc.close();
       System.out.println(fibonaciSeries(n));
	}

	public static long fibonaciSeries(long n) {
		// TODO Auto-generated method stub
		long temp ;
        long a=0,b=1;
        
        if(n==0)
        return a;
         
            for(int i=2; i<=n; i++)
            {
                temp=a+b;
                a=b;
                b= temp;
            }
        
        return b;
	}

}
