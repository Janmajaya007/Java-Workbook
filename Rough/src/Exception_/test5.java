package Exception_;

import java.util.Scanner;

class myclass extends Exception {
	public myclass(String msg) {
		super(msg);
	}
}

class input {
	
	
	void inputNumber(int i)    {
		if (i > 10)
			throw new RuntimeException("Number is not in the range");
	}
}

public class test5 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		input i1 = new input();
		
			i1.inputNumber(n);
		
			
		
	}

}
