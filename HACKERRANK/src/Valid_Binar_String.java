import java.util.Scanner;

public class Valid_Binar_String {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the Binary String");
		 String s= sc.next();
		// System.out.println("Enter the substring size");
		 int d=sc.nextInt();
		 int c=0; int count=0;
		 for(int i=0; i<s.length(); i++ ) { 
			 String ss=s.substring(i, (i+d));
			 System.out.println(ss);
			 for(int j=0;j<d;j++) {
				 if(ss.charAt(j)==1) {
					 c++; 
				 }
			 }
			 System.out.println(count);
			
		 }
		
			
	}

}
