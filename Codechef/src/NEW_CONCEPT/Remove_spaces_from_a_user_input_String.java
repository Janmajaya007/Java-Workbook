package NEW_CONCEPT;

import java.util.Scanner;

public class Remove_spaces_from_a_user_input_String {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String str=sc.next();
		 String ns=removespace(str);
		 System.out.println(ns);

	}

	 static String removespace(String str) {
		 
	        char phrase[] = str.toCharArray();
	        int i = 0;
	        int n = 0;

	        while(phrase[i] != '\0') {
	            if(phrase[i] == ' ') {
	                for(n=i; n<phrase.length; n++) {
	                    phrase[n] = phrase[n+1];
	                }
	            }
	            i++;
	        }

	        String output = new String(phrase);
	        
		return output;
	}

}
