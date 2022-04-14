package String__;

import java.util.Scanner;

public class check_palindrome_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();

		checkPalindrome(str);
		sc.close();

	}

	public static void checkPalindrome(String str) {
		char ch[] = str.toCharArray();
		int start = 0, end = str.length() - 1;

		while (start <= end) {
			if (ch[start] == ch[end]) {
				start++;
				end--;
				continue;
			} else {
				System.out.println("The String is not a palindrome");
				break;
			}
		}

		if (start >= end) {
			System.out.println("The string is a palindrome");
		}

	}

}
