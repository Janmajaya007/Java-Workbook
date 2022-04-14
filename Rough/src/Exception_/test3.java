package Exception_;

import java.util.Scanner;

class NewException extends Exception{
	 
	NewException(String s){
		super(s);
	}
}
public class test3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter password");
	String pwd=sc.next();
	if(pwd.equals("0")) 
		throw new NewException("Invalid password");
	 
 
 
	}

}
