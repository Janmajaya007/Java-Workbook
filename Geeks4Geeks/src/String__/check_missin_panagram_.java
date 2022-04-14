package String__;

import java.util.Scanner;

public class check_missin_panagram_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the panagram");
		String srting = sc.nextLine();
		String missing = panagramCheck(srting);
		System.out.println(missing);
	}

	private static String panagramCheck(String str) {
		// TODO Auto-generated method stub
		str.toLowerCase();
		 char s[]=str.toCharArray();
		 int arr[]=new int[26];
             
		 for(int i=0; i<str.length(); i++) {
			 arr[(int)(s[i]-'a')]++;
		 }
		 String s2="";
		 for(int i=0;i<26;i++){
	          if(arr[i]==0){
	              s2=s2+(char)(i+'a');
	          }
	      }
		return s2;
	}

}
