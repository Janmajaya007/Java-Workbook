package Day__1;

import java.util.Scanner;

public class string_weight_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strint str");
		String str = sc.nextLine();
		System.out.println("input n");
		int n = sc.nextInt();
		System.out.println(weight(str, n));
		sc.close();

	}

	public static int weight(String input1, int n) {
		// TODO Auto-generated method stub
		String str = input1;
		str = str.toLowerCase();
		int sum = 0;
		str=str.replaceAll("[-+^!&]*"," ");
		if (n == 0) {
			for (int i = 0; i < str.length(); i++) {
				int c = (str.charAt(i) - 'a') + 1;
				if ((c) >= 0 && (c) <= 25) {
					if ((c != 1) && (c != 5) && (c != 9) && (c != 15) && (c != 21)) {
						sum = sum + (c);
					}}}
		} else if (n == 1) {
			for (int i = 0; i < str.length(); i++) {
				int c = (str.charAt(i) - 'a') + 1;
				if ((c) >= 0 && (c) <= 25) {
					sum = sum + (c);
				}}}
		return sum;
	}

}
