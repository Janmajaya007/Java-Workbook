package com.lambdaExpression;
interface bookingCab{
	void booking();
}
public class demo4 {
	
	static int instanceVar = 99;
	static double totalDistance = 56.36;
	public static void main(String[] args) {
		
		bookingCab bc = () ->{
			int local = 569874;
			System.out.println("I am booking a cab");
			System.out.println(local);
			System.out.println("The price of per liter petrol iss "+instanceVar); 
			System.out.println("Total distance to be cover is "+totalDistance);
			System.out.println(local);
		};
		bc.booking();
	}

}
