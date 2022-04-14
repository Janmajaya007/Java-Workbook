import java.util.Scanner;

public class pangrams {

	public static String pangram(String s) {
		s=s.replaceAll("\\s", "");
		 int arr []= new int [26];
		 
		 String ss="pangram";
		 for(int i=0;i<s.length();i++) {
			 int index= s.charAt(i)-'a';
			 arr[index] ++;
		 }
		 
		 for(int i=0;i<26;i++) {
			  if(arr[i]==0) {
				ss="not pangram" ; 
				return ss;
				
			  }
			  break;
		 }
		return ss;
		 
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 String s="We promptly judged antique ivory buckles for the next prize" ; 
	
		 System.out.println(pangram(s.toLowerCase()));
		 sc.close();
	}

	

}
