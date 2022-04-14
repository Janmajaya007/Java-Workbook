package MethodReferencing.constructor;

public class test {

	public static void main(String[] args) {
		
		myInterface m = str ->new myClass(str);
		  m.get("My name is Janmajay");
		  String str="Hi Hello Namaste";
		  myInterface mi= myClass::new;
		  mi.get(str);
		
	}

}
