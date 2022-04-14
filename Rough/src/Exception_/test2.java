package Exception_;

import java.util.Scanner;

class MyException extends Exception {
	MyException(String s) {
		super(s);
	}
}

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
try {
	if(n==0) {
		throw new MyException("Enter non zero number");
	}
}
catch(Exception e) {
	System.out.println(e);
}
	}

}
