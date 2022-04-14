import java.util.ArrayList;
import java.util.Scanner;

public class string_Permutation {

	public static void main(String[] args) {
		  Scanner  sc=new Scanner(System.in);
		  String s= sc.next();
		  permutation(s);
		  sc.close();

	}

	public static void permutation(String s) {
		ArrayList<String> al=new ArrayList<>();
         
        permutation1(al,s);
 		for(int i=0;i<al.size();i++) {
 			System.out.println(al.get(i));
 		}
	}

	public static ArrayList<String> permutation1(ArrayList<String> al,   String S) {
		 int len=S.length();
		 int  i, j;
	        
	        char[] ch = S.toCharArray();
	  
	           
	        for(  i=0;i<len; i++) {
	        	for(  j=len-1;j>=0;j--) {
	        		 char temp = ch[i]; 
	     	        ch[i] = ch[j]; 
	     	        ch[j] = temp; 
	     	        String x=new String(ch);
	     	       
	    	        if(x!=S && !al.contains(x))
	    	        {
	    	            al.add(x);
	    	        }
	        	}
	        }
	       
	       
	        
	        return  al;
	       
	        		
	}

}
