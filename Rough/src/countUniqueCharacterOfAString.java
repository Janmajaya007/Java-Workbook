import java.util.*;
public class countUniqueCharacterOfAString {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String str= sc.nextLine();
		 String temp="";
		 for(int i=0;i<str.length();i++) {
			 if(temp.indexOf(str.charAt(i))==-1)
			 {
				 temp=temp+str.charAt(i);
			 }
		 }
		 System.out.println(temp.length());
	}
}
