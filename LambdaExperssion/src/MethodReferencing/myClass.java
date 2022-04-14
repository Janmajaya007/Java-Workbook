package MethodReferencing;

public class myClass {
	public void  mymethod123(int i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		myClass mc= new myClass();
		myInterface mi =mc::mymethod123;
		mi.myMethod(1984);
	}

}
