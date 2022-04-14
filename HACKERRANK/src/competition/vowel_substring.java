package competition;

import java.util.ArrayList;
import java.util.Scanner;

public class vowel_substring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		s=s.toLowerCase();
		int k=sc.nextInt();
	 
System.out.println(substring(s,k));
	}

	public static String substring(String s, int k) {
		ArrayList<String> sub=new ArrayList<>();
		ArrayList<Integer> count =new ArrayList<>();
	    for(int  i=0;i<=(s.length()-k);i++){
	        sub.add(s.substring(i,i+k));
	    }
	    int v=0;int max=0;
	    for(int i=0;i<sub.size();i++){
	        String ss=sub.get(i);
	        for(int j=0;j<ss.length();j++){
	            if((ss.charAt(j)=='a')||(ss.charAt(j)=='e')||(ss.charAt(j)=='i')||(ss.charAt(j)=='o')
	            ||(ss.charAt(j)=='u')){
	                v++;
	       }
	        }
	        count.add(v);
 		v=0;
	    }
	     
	    for(int i=0;i<count.size();i++) {
	    	if(count.get(i)>max) {
	    		max=count.get(i);
	    	}}
	    
	    String sss= null;
	    for(int i=0;i<sub.size();i++) {
    		if(count.get(i)==max) {
    			 sss= sub.get(i);
    			 break; 
    		}
    	}
	    
	   if(sss==null) {
		   return "Not found!";
	   }
	   
	   return sss;
 	   }}


