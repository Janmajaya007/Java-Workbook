package String__;

import java.util.Scanner;

public class panagram_checker_BRuTFORCE_approach_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		 
		String result=panagramChecker(str );
		System.out.println(result);
		sc.close();
	}

	public static String panagramChecker(String str) {
		 boolean arr[]=new boolean[26];
		 for(int i=0;i<str.length(); i++) {
			 if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				arr[str.charAt(i)-'a']=true; 
			 }
			 
			 if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
					arr[str.charAt(i)-'A']=true; 
				 }
		 }
		 String res="";
	for(int i=0; i<26; i++) {
		if(arr[i]==false) {
			res=res+(char)(i+'a');
		}
	}
		 
		return res;	 
}

}
