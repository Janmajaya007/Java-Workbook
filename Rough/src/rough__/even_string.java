package rough__;

import java.util.Arrays;
import java.util.Scanner;

public class even_string {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println(evenString(str));
	}

	private static int evenString(String str) {
		int arr[] = new int[26], count = 0;
		char c[] = str.toCharArray();
		Arrays.sort(c);
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'a']++;
		}
		for (int ar : arr) {
			if (ar % 2 != 0)
				count++;
		}
		return count;
	}
}
/*
 * arr[0]=3 arr[24]=3 str =axxaxa
 * 
 * a a a x x x 0 1 2 3 4 5 i=0 j=0 c[i]==c[j]
 * 
 */

//4 1 4 1