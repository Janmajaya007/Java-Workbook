package String__;

import java.util.Scanner;

public class Pattern_searching_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Main String");
		String str = sc.nextLine();
		System.out.println("Enter the pattern to be search");
		String ps = sc.nextLine();
		Pattern_Search_(str, ps);
	}

	private static void Pattern_Search_(String str, String ps) {
		int size = ps.length();
		for (int i = 0; i <= str.length() - size; i++) {
			String ss = str.substring(i, i + size);
			if (ss.compareTo(ps) == 0)
				System.out.print(i + " ");
		}
	}

}
