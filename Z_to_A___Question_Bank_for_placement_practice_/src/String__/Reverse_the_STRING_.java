package String__;

import java.util.Scanner;

public class Reverse_the_STRING_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println("The reverse string is below");
		reverse(str);
		sc.close();
	}

	public static void reverse(String str) {
		char ch[] = str.toCharArray();
		int start = 0, end = str.length() - 1;
		char c = ' ';
		while (start <= end) {
			c = ch[start];
			ch[start] = ch[end];
			ch[end] = c;
			start++;
			end--;
		}
		String s = String.valueOf(ch);
		System.out.print(s + " ");
	}

}
