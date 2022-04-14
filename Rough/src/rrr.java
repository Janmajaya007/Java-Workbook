import java.util.Scanner;

public class rrr {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	int c=0;
	for(int i=0; i<s1.length(); i++) {
		for(int j=0; j<s2.length(); j++) {
			//System.out.println(s1.charAt(i));
			//System.out.println(s2.charAt(j));
			if(s1.charAt(i)==s2.charAt(j)) {
				c++;
			}
		}
		 }
	if(c!=0)
		 System.out.println("YES");
	 else
		 System.out.println("NO");

	
	
	
}
}
