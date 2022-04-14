import java.util.Scanner;

public class GameOfThrones_1_type2 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		 String s1=check(s);
		 System.out.println(s1);
		 
	}

	private static String check(String s) {
		int fre[]=new int[26];
		 for(int i=0; i<s.length(); i++) {
			 fre[s.charAt(i)-'a']++;
		 }
		 
		 boolean present=false;
		 for(int i=0; i<26;i++) {
			 if(fre[i]%2!=0) {
				 if(present)
					 return "NO";
				 else
					 present=true;
			 }
		 }
		 return "YES";
	}

}
