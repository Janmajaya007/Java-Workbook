import java.util.Scanner;

public class print_character_according_to_number_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		// int t=str.charAt(index)
		printCharacter(str);
		sc.close();
	}

	public static void printCharacter(String str) {
		for (int i = 0; i <str.length(); i++) {
			int ans = 0;
			if (str.charAt(i)>= 48 && str.charAt(i) <= 57) {
				char temp = str.charAt(i - 1);
				while  (str.charAt(i)>= 48 && str.charAt(i) <= 57){
					ans = ans * 10 + (str.charAt(i) - '0');
					i++;
				}
				for (int j = 1; j <=ans; j++) {
					System.out.print(temp + " ");
				}

			}
		}
	}

}
