package Question_of_the_day_;

import java.util.Scanner;

/*
 * https://www.youtube.com/watch?v=LlsizG8Pju8
 */
public class ip_address_validation_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the string");
		String str = sc.nextLine();
	
		boolean num = validIPAddress(str);
		System.out.println(num);
		sc.close();

	}

	private static boolean validIPAddress(String str) {
		// TODO Auto-generated method stub
		String[] string = str.split("\\.");
		if (string.length != 4) {
			return false;
		}
		for (String s : string) {
			try {
				if (s.length() > 3)
					return false;
				Integer part = Integer.valueOf(s);
				if (part == 00 &&  part == 000 )
					return false;
				if (part > 255)
					return false;
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}
}
