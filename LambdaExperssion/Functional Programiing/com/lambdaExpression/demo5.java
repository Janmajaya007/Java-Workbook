package com.lambdaExpression;
// Method Reference in lambda expression in java
// for static and non-static methods
interface claculator{
	void add(int a , int b);
}

class calC {
	public static void addSomthing(int a, int b) {
		System.out.println("Sum of number "+ a+" and "+b+" is "+(a+b));
	}
	
	public   void letsAdd(int a, int b) {
		System.out.println("Sum of number "+ a+" and "+b+" is "+(a+b)+" in a non-static method");
	}
}
public class demo5 {

	public static void main(String[] args) {

			//calC.adSomthing(52, 8);
		
		
		//Reference a static method
//		claculator cf = calC::addSomthing;
//		cf.add(45, 45);
		
//		Reference to a non-static method
		calC c = new calC();
		claculator cu = c::letsAdd;
		cu.add(10,50);
	}

}
