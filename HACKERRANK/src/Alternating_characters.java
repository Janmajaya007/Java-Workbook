import java.util.Scanner;

public class Alternating_characters {

	public static void main(String[] args) {
		// System.out.println("janmajaya");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt(); //The number of String to be input in the list
	String[] arr = new String[n]; int count=0;
	
		 for(int i=0; i<n; i++) {
			  arr[i]=sc.next();
		 }
			 for(int i=0; i<n;i++) {
 				 String ss=arr[i];
 				 for(int j=0;j<ss.length()-1;j++) {
 					 if(ss.charAt(j)==ss.charAt(j+1)) 
 					         count++;
 						}
 				 System.out.println(count);
     count=0;
			 }
				 
		 }

	}


