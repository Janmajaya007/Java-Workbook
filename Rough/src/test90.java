import java.util.Scanner;

public class test90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.next();
boolean s=alikeString(str);
System.out.println(s);
	}

	 

	private static  boolean alikeString(String str) {
		// TODO Auto-generated method stub
		int len=str.length();
		String s1=str.substring(0, len/2);
		String s2=str.substring(len/2);
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int c1=0, c2=0;
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]=='a'||ch1[i]=='e'||ch1[i]=='i'||ch1[i]=='o'||ch1[i]=='o')
				c1++;
		
		
		if(ch2[i]=='a'||ch2[i]=='e'||ch2[i]=='i'||ch2[i]=='o'||ch2[i]=='o')
			c2++;
		}
	if(c1==c2)
		return true;
	else
		return false;
	}

}
