package HackerRank;

import java.util.Scanner;

public class test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = sc.nextLine();

		String res = concad(str1);
		System.out.println(res);
	}

	private static String concad(String fullName) {
		// TODO Auto-generated method stub
		String[] arr = fullName.split(" ");

		String s2, s1;

		if (arr[0].length() > 3)
			s1 = arr[0].substring(0, 3);
		else
			s1 = arr[0].substring(0);

		if (arr[1].length() > 2)
			s2 = arr[1].substring(0, 2);
		else
			s2 = arr[1].substring(0);

		String ss = s1 + "-" + s2 + "@companyname.organization";
		return ss;
	}

}
