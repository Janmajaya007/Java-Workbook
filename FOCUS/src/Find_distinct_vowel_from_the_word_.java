import java.util.Scanner;

public class Find_distinct_vowel_from_the_word_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   String str=sc.next();
   distinct(str);
   sc.close();
	}

	private static void distinct(String str) {
		str=str.toLowerCase();
 		char ch[]= {'a', 'e', 'i','o','u'};
 		
 		char arr[]=new char[26];
 		for(int i=0;i<str.length();i++) {
 			arr[str.charAt(i)-'a']++;
 		}
 		int count=0;
 		
 		for(int i=0;i<ch.length;i++) {
 			if(arr[ch[i]-'a']>0){
 				count++;
 			}
 		}
 		System.out.println(count);
	}

}
