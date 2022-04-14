package String__;

import java.util.Scanner;

public class count_and_say_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n = sc.nextInt();
		System.out.println(countAndSay(n));
		sc.close();
	}

	private static String countAndSay(int n) {
		// TODO Auto-generated method stub
		if (n < 1)
			return "invalid input";
		if (n == 1)
			return "1";
		if (n == 2)
			return "11";

		String s = "11";
	 
		for (int i = 3; i < n; i++) {
			String t = "";
			s = s + '@';
			int c = 1;
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(j) != s.charAt(j-1)) {
					t = t + Integer.toString(c);
					t = t + s.charAt(j - 1);
					c = 1;
				} 
				c++;
			}
			s = t;
		}
		return s;
	}
}
