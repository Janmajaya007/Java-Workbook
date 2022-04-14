package Question_of_the_day_;

import java.util.Scanner;

public class implement_Atoi_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the string");
		String str = sc.nextLine();
		int num = Aatoi(str);
		System.out.println(num);
		sc.close();
	}

	private static int Aatoi(String str) {

		if (str.length() == 0) {
			return -1;
		}

		int sign = 1;

		int res = 0;

		int i = 0;

		if (str.charAt(i) == '-') {
			sign = -1;

			i++;
		}

		for (; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)) == false) {
				return -1;
			}
			res = res * 10 + Character.getNumericValue(str.charAt(i));
		}

		return sign * res;
	}

}
