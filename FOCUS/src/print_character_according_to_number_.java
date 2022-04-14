import java.util.Scanner;

public class print_character_according_to_number_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		printCharacter(str);
		sc.close();
	}

	public static void printCharacter(String str) {

		for (int i = 1; i < str.length(); i += 2) {
			int num = str.charAt(i) - '0';
			for (int j = 0; j < num; j++) {
				System.out.print(str.charAt(i - 1) + " ");
			}
		}

	}

}
