package com.lambdaExpression;
@FunctionalInterface
interface cabBooking{
	void bookCab(String souce, String destination);
}
public class demo2 {

	public static void main(String[] args) {
		cabBooking c = (source,destination) -> {
			System.out.println("I Booked a cab for my office from my home"
					+ source+" to my office at "+destination);
		};
		c.bookCab("Bhubaneswar", "Balasore");
	}

}
