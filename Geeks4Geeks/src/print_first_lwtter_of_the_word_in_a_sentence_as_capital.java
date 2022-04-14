import java.util.Scanner;

public class print_first_lwtter_of_the_word_in_a_sentence_as_capital {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Sentence");
		 String s=sc.nextLine();
		 sc.close();
		 s=" "+s;
		 String r="";
		 for(int i=0;i< s.length();i++) {
			 char ch=s.charAt(i);
			 if(ch==' ') {
				  r=r+ch;
				  i++;
				 ch=s.charAt(i);
				 r+=Character.toUpperCase(ch);
			 }
			 else {
				 r=r+ch;
			 }
		 }
		 r=r.trim();
System.out.println(r);
	}

}
