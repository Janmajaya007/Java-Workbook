package HackerRank;

import java.util.Scanner;

public class Numberline_jumps_ {
	public static String kangaroo (int x1, int v1, int x2, int v2) {

		int n=x2-x1;
		int d=v1-v2;
		int res;
		if(d==0)
			return "NO";
		else
		  res=(n)%(d);
		
		if(v1>v2) {
			if(res==0)
				return "YES";
			else 
				return "NO";
		}
		return  "NO";
	}
	 
	public static void main(String[] args) {
		 
Scanner sc= new Scanner(System.in);
int x1=sc.nextInt();
int v1=sc.nextInt();
int x2=sc.nextInt();
int v2=sc.nextInt();
String ans= kangaroo(x1,v1,x2,v2);
System.out.println(ans);
sc.close();
	}
}
