import java.util.Scanner;

public class GameOfThrones_1 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner (System.in);
	 String s=sc.next();
	 
	 int n=s.length();
	 //System.out.println(n);
	 if(n%2==0) {
		 String s1= even(s);
		 System.out.println(s1);
		 
	 }
	 else {
		  String s2=odd(s);
		  System.out.println(s2);
		 
	 }
	}

	private static String even (String s) {
		int c=0;
		 for(int i=0;i<s.length(); i++) {
			// System.out.println(s.charAt(i));
			 for(int j=0;j<s.length(); j++) {
				 //System.out.println(s.charAt(j));
				 if(s.charAt(i)==s.charAt(j))
					 c++;
			 }
			 //System.out.println(c);	
			 if(c%2==1) {
				 return "NO";
				 	 } 
			 c=0; 
		 }
		return "YES";
		 
	}

	private static String odd (String s) {
		int c=0; int co=0;
		 for(int i=0;i<s.length(); i++) {
			// System.out.println(s.charAt(i));
			 for(int j=0;j<s.length(); j++) {
				 //System.out.println(s.charAt(j));
				 if(s.charAt(i)==s.charAt(j))
					 c++;
			 }
			 if(c==1) {
				 co++;
			 }
			 c=0;
		 }
		  if(co>1) {
			  return "NO";
		  }
		return "YES";
		 
		
	}

}
