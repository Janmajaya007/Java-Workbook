package com.lambdaExpression;

interface onlineCab{
	double bookCab(String souce, String destination);
}
public class demo3 {

	public static void main(String[] args) {
		onlineCab c = (source,destination) -> {
			System.out.println("I Booked a cab for my office from my home"
					+ source+" to my office at "+destination);
			return 89.369;
		};
		double fare = c.bookCab("Bhubaneswar", "Balasore");
		System.out.println("The total fare for the tarvel is "+fare);
	}

}
