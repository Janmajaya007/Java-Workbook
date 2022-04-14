package ppt;

import java.util.Scanner;

public class length_of_the_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 String s=sc.next();
 int l=0;
 char ch[]=s.toCharArray();
for(char c:ch) {
	l++;
}
System.out.println(l);
	}

}
