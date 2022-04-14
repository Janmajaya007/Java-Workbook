package MethodReferencing;

public class referenceMethod {
	public static void myMethod() {
		for(int i=0;i<10; i++) {
			System.out.println("Janmajaya You are Great");
		}
	}
	public static void main(String[] args) {
		
		Runnable r =referenceMethod::myMethod;
		Thread t= new Thread(r);
		t.start();
		System.out.println("So you don't be nervous");
		
	}

}
