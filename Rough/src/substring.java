 import java.util.*;
import java.lang.*;
import java.io.*;

class substring {
	public static void main (String[] args) {
		//code
		Scanner sc= new Scanner(System.in);
		int t =sc.nextInt();
		
		while(t-->0){
			 int c=0;
		    String s=sc.next();
		    String ss="gfg";
		    int n=s.length();
		    for(int i=0;i<=n-3;i++){
		        String sss= s.substring(i, i+3);
		       if( sss.equals(ss)) {
		    	     c++;
		       }
		        
		        }
		    if(c==0) {
		    	System.out.println(-1);
		    }
		    else {
		    System.out.println(c);
		    }
		    c=0;
 		}
		
		sc.close();
	}
}