package rough__;

import java.util.Arrays;
import java.util.Scanner;

public class second_even_string_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		evenString_(str);
	}

	private static void evenString_(String str) {
		// TODO Auto-generated method stub
		char c[] = str.toCharArray();
		int oddCount = 0, count = 0, j = 0;
		Arrays.sort(c);

		for (int i = 0; i < str.length(); i++) {
			if (c[j] == c[i]) {
				count++;
			} else {
				if (count % 2 != 0) {
					oddCount++;
				}
				j = i;
			}
		} 
		if (count % 2 != 0) {
			oddCount++;
		}

		System.out.println(oddCount);
	}
}
