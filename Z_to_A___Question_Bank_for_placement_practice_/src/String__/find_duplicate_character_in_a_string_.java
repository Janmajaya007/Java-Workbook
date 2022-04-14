package String__;

import java.util.Scanner;

public class find_duplicate_character_in_a_string_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println("character" + "  " + "character_count");
		findDuplicate(str);
		sc.close();
	}

	public static int num = 256;

	public static void findDuplicate(String str) {

		int count[] = new int[num];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		for (int i = 0; i < num; i++) {
			if (count[i] > 1)
				System.out.println((char) (i) + "            " + count[i]);
		}
	}

}
