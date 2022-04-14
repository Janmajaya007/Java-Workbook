import java.util.Scanner;
public class Reverse_word_in_a_string_ {
	/*
	 * This code is to reverse the words in a string. if the given string is a
	 * sentence then this code separate all the words and print them in reverse
	 * order
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		reverseString(str);
	}

	public static void reverseString(String str) {
		String string[] = str.split(" ");
		for (int i = string.length - 1; i >= 0; i--)
			System.out.print(string[i] + " ");
	}
}
