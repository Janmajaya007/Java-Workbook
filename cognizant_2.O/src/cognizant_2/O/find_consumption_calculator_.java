package cognizant_2.O;


import java.util.*;

public class find_consumption_calculator_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of liters to fill the tank");
double liter = sc.nextDouble();
if (liter > 0) {
	System.out.println("Enter the distance covered");
	double distance = sc.nextDouble();
	if (distance > 0) {
		double fuel = (liter / distance) * 100;
		double miles = (distance * 0.6214);
		double gallons = (liter * 0.2642);
		double milesPerGalon = (miles / gallons);

		System.out.println("Liters/100KM");
		System.out.println(String.format("%.2f", fuel));
		System.out.println("Miles/gallons");
		System.out.println(String.format("%.2f", milesPerGalon));
	} else {
		System.out.printf("%d is an Invalid Input",(int)distance);
	}
} else {
System.out.printf("%d is an Invalid Input",(int)liter);
}
sc.close();
	
	}
}
