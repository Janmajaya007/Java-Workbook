package february_long_challange_2021;

import java.util.Scanner;

public class Chef_and_Meeting2 {
	
	public static int convert(String str) {
		 int h1 = (int)str.charAt(1) - '0';
		    int h2 = (int)str.charAt(0) - '0';
		    int hh = (h2 * 10 + h1 % 10);
		 
		 if(str.charAt(5)=='A') {
			 if(hh==12) {
				 int m=Integer.parseInt( str.substring(3, 5));
				 return m;
			 }
			 else{
				 int mi=hh*100+(Integer.parseInt(str.substring(3, 5)));
				 return mi;
			 }
		 }
		 else {
			 if(hh==12) {
				 int m=hh*100+(Integer.parseInt(str.substring(3, 5)));
				 return m;
			 }
			 else{
				 int mi=(12+hh)*100+(Integer.parseInt(str.substring(3, 5)));
				 return mi;
			 }
			 
		 }
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of test case");
		 int N=sc.nextInt();
	
		 while(N-->0) {
			 System.out.println("Enter the Meeting time");
			 String T=sc.next();
			 T = T.replaceAll("\\s", ""); 
			  int meeting_time=convert(T);
			 System.out.println(meeting_time );
			 System.out.println("Enter the number of friends");
			 int n=sc.nextInt();
			 
			 String L[]=new String [n];
			 String R[]=new String [n];
			 
			 int start []=new int [n];
			 int end []=new int [n];
			 
			 for(int i=0;i<n;i++) {
				  L[i]=sc.next();
				  R[i]=sc.next();
			 }
			 
			 
		    for(int i=0;i<n;i++) {
		    	 start[i]=convert(L[i]);  
			 }
			 
			 for(int i=0;i<n;i++) {
		    	 end [i]=convert(R[i]);  
			 }
			 
			 for(int i=0;i<n;i++) {
		    	 System.out.println(start[i]);
			 }
			 
			 for(int i=0;i<n;i++) {
		    	 System.out.println(end[i]);
			 }
		 }
sc.close();

	}

}
