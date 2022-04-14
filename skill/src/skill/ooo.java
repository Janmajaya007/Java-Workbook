package skill;

public class ooo {

	public static void main(String[] args) {
		String sentence = "Love the life you live. Live the life you love";

		String[] arr = sentence.split("l", 0);

		for (String str: arr) {

			System.out.println(str);

			}

		System.out.println(arr.length);
	}

}
