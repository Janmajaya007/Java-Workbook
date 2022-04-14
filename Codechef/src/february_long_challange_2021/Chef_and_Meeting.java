package february_long_challange_2021;

import java.util.Scanner;

public class Chef_and_Meeting {
	
	public static void   timeformat (String str) {
		
		// Get hours
	    int h1 = (int)str.charAt(1) - '0';
	    int h2 = (int)str.charAt(0) - '0';
	    int hh = (h2 * 10 + h1 % 10);
	 
	    // If time is in "AM"
	    if (str.charAt(6) == 'A')
	    {
	        if (hh == 12)
	        {
	            System.out.print("00");
	            for (int i = 2; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	        else
	        {
	            for (int i = 0; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	    }
	 
	    // If time is in "PM"
	    else
	    {
	        if (hh == 12)
	        {
	            System.out.print("12");
	            for (int i = 2; i <= 7; i++)
	                System.out.print(str.charAt(i));
	        }
	        else
	        {
	            hh = hh + 12;
	            System.out.print(hh);
	            for (int i = 2; i <= 7; i++)
	                System.out.print(str.charAt(i));
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
			 timeformat(T);
			 System.out.println("Enter the number of friends");
			 int n=sc.nextInt();
			 
			 String L[]=new String [n];
			 String R[]=new String [n];
			 for(int i=0;i<n;i++) {
				  L[i]=sc.next();
				  R[i]=sc.next();
			 }
			 
			 
		    for(int i=0;i<n;i++) {
		    	 timeformat(L[i]);
		    	 System.out.print(" ");
			 }
			 System.out.println();
			 for(int i=0;i<n;i++) {
				 timeformat(R[i]);
				 System.out.print(" ");
			 }
			 
		 }
sc.close();
	}

}
