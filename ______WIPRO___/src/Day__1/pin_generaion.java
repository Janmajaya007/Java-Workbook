package Day__1;

import java.util.*;
/*
 * Here the range of input1 , input2, input3 is >=100 and <=999
 * all the three input are three digits number
 */
public class pin_generaion {
public static void Pin(int input1, int input2, int input3)
{
	String s1=Integer.toString(input1);
	String s2=Integer.toString(input2);
	String s3=Integer.toString(input3);
	int u1=Integer.parseInt(String.valueOf(s1.charAt(2)));
	int u2=Integer.parseInt(String.valueOf(s2.charAt(2)));
	int u3=Integer.parseInt(String.valueOf(s3.charAt(2)));

	int t1=Integer.parseInt(String.valueOf(s1.charAt(1)));
	int t2=Integer.parseInt(String.valueOf(s2.charAt(1)));
	int t3=Integer.parseInt(String.valueOf(s3.charAt(1)));

	int h1=Integer.parseInt(String.valueOf(s1.charAt(0)));
	int h2=Integer.parseInt(String.valueOf(s2.charAt(0)));
	int h3=Integer.parseInt(String.valueOf(s3.charAt(0)));

	int u= Math.min(u1,Math.min(u2,u3));
	int t= Math.min(t1,Math.min(t2,t3));
	int h= Math.min(h1,Math.min(h2,h3));
	int th= Math.max(u1,Math.max(u2,Math.max(u3,Math.max(t1,Math.max(t2,Math.max(t3,Math.max(h1,Math.max(h2,h3))))))));
	
	int pin=((th*1000)+(h*100)+(t*10)+u);

	System.out.println(pin); 
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1");
		int n1 = sc.nextInt();
		System.out.println("Enter n2");
		int n2 = sc.nextInt();
		System.out.println("Enter n3");
		int n3 = sc.nextInt();
		 Pin(n1,n2,n3);
		 sc.close();

	}

}
