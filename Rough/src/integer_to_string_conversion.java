import java.util.Scanner;

public class integer_to_string_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int n=20000;
String s=Integer.toString(n);   //Integer.toString(n)  Method
System.out.println(s);
System.out.println();

int number= 100388;
String num=  String.valueOf(number);  //String.valueOf(number);  Method
System.out.println(num);
System.out.println();


int d = 1234;
String str4 = new Integer(d).toString();
System.out.println("String str4 = " + str4);

		String S="abc";
		int sum=0;

for(int i=0; i<S.length(); i++) {
	System.out.printf("%c",  S.charAt(i));
	///System.out.println(S.charAt(i));
	 sum+= S.charAt(i);
		

	//System.out.println(sum);
}
System.out.println(sum);

 
		int n=1452;
		String s=Integer.toString(n);
		//int s= Integer.parseInt(String.valueOf(s.charAt(1)));
		///System.out.println(s.charAt(1) );
		int a=Integer.parseInt(String.valueOf(s.charAt(3)));
		int b=Integer.parseInt(String.valueOf(s.charAt(2)));

		System.out.println(a+b);*/
		Scanner sc=new Scanner(System.in);
       	 String s1=sc.next();
       	 String s2=sc.next();
        
		
		 int s1l=s1.length();
		 System.out.println(s1l);
		 int s2l=s2.length();
		 System.out.println(s2l);
		 int c=0;
		 
		 
		 if(s1l<s2l) {
			 for(int i=0; i<s1.length(); i++) {
				 char ch=s1.charAt(i);
				 System.out.println(ch);
				 for(int j=0;j<s2.length();j++) {
					 if(ch==s2.charAt(j)) {
						 System.out.println(ch);
				//	  System.out.println(s2.charAt(j));
						 c++;
					 }}}}
			/* if(s1l>s2l) {
				 for(int i=0; i<s2.length()-1; i++) {
					 for(int j=0;j<s1.length()-1;j++) {
						 if(s2.charAt(i)==s1.charAt(j))
							 c++;
					 } }}*/
		
	         if(c!=0) 
	        	 System.out.println("YES");
	         
	         else
	        	 System.out.println("NO");

	}

}
