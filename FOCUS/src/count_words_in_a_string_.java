import java.util.Scanner;

public class count_words_in_a_string_ {
	static final int OUT = 0;
	static final int IN = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strint str");
		String str = sc.nextLine();
		System.out.println(stringCount(str));
		sc.close();

	}

	public static int stringCount(String str) {
		int state = OUT;
		int wc = 0;  
		int i = 0;
 
		while (i < str.length()) {
			 
			if (str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == ';'
					||str.charAt(i) == ':' || str.charAt(i) == '?' || str.charAt(i) == '.'
					|| str.charAt(i) == '!')
				state = OUT;
  
			else if (state == OUT) {
				state = IN;
				++wc;
			}
  
			++i;
		}
		return wc;
 	}

}
