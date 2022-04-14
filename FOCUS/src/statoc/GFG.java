package statoc;
import java.io.*;
class GFG {
	public GFG()
	{
		// Constructor of GFG class
		System.out.println("GFG Constructor");
	}
}
class SubClass extends GFG {

	SubClass()
	{
		// Constructor of SubClass class
		// By default super() is hidden here
		// So Super class i.e GFG class constructor called
		System.out.println("Subclass Constructor");
	}
	public static void main(String args[])
	{
		// SubClass class object created
		// Automatically SubClass() constructor called
		SubClass obj = new SubClass();
	}
}