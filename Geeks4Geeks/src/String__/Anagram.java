package String__;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string");
		String str2 = sc.nextLine();
		checkAnagram(str1, str2);
		sc.close();

	}

	public static int num = 256;

	private static void checkAnagram(String str1, String str2) {
		int l1 = str1.length(), l2 = str2.length(), flag = 0;
		if (l1 != l2) {
			System.out.println("NO");
		} else if (l1 == l2) {
			int arr[] = new int[num];
			for (int i = 0; i < l1; i++) {
				arr[str1.charAt(i) - 'a']++;
			}
			for (int i = 0; i < l2; i++) {
				arr[str2.charAt(i) - 'a']--;
			}
			for (int ar : arr) {
				if (ar != 0) {
					flag++;
					System.out.println("NO");
					break;
				}

			}
			if (flag == 0) {
				System.out.println("YES");
			}
		}
	}

}
