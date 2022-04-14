package rough__;

import java.math.BigInteger;
import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
BigInteger fact = BigInteger.valueOf(1);
for (int i = 1; i <= n; i++)
    fact = fact.multiply(BigInteger.valueOf(i));
System.out.println(fact);
}

}
