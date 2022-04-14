import java.util.Scanner;

public class test95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String str=sc.next(); //take the string as input
char ch[]=str.toCharArray();//convert the string into  character array
for(int i=0;i<str.length();i=i+2) {
	System.out.print(ch[i]+""); //only the odd index value will accessed 
}
	}

}
