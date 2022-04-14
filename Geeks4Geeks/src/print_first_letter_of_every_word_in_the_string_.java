import java.util.Scanner;

public class print_first_letter_of_every_word_in_the_string_ {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
		 String str=sc.nextLine();
		 System.out.println(split(str));
		 sc.close();
	}

	private static String split(String str) {
		StringBuffer first=new StringBuffer();
		 String words [] =str.split(" ");
		 for(int i=0;i<words.length;i++) {
			 String s=words[i];
			 first.append(s.charAt(0));
		 }
		 
		 String firstletterword =first.toString();
		return firstletterword;
		
	}

}
