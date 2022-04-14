import java.util.Scanner;

public class Two_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
         int p= sc.nextInt();
          
        	 String s1=sc.next();
        	 String s2=sc.next();
        	 commpare (s1, s2);
        	  
         
         
	}

	  static void commpare(String s1, String s2) {
		  
		  int c=0;
			for(int i=0; i<s1.length(); i++) {
				for(int j=0; j<s2.length(); j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						c++;
					}}}
			if(c!=0)
				 System.out.println("YES");
			 else
				 System.out.println("NO");

	  }}
