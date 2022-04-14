package com.lambdaExpression;

@FunctionalInterface
interface cab{
	void bookCab();
}
 class ola implements cab{

	@Override
	public void bookCab() {
		System.out.println("Ola No_35 Booked!!... It will arrive near you very soon....");		
	}
}
public class demo1 {
	public static void main(String[] args) {
		/* 1 Normal
		cab c = new ola();
		c.bookCab();
		*/
		
		//Using lambda Expression  ->  works with f
		cab c = () -> {
			System.out.println("I Booked a cab for my office.......");
		};
		c.bookCab();
	}

}
