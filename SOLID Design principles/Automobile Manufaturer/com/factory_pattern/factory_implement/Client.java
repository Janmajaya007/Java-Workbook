package com.factory_pattern.factory_implement;

import java.util.Scanner;
import com.factory_pattern.factories.Factory;
public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car name : ");
		String name = sc.nextLine();
		sc.close();
		Factory f = FactoryImpl.getFactory(name);
		if(f != null)
			System.out.println(f);
		else
			System.out.println("Invalid Comapany Name....");
	}
}
