package rough__;

interface A{

	public void display();

	public void printNumber(int a);	

}

class Test{

	public static void main(String args[])

	{		

		A a1={ ( ) -> System.out.println("Hai");

   			      (a) -> System.out.println(a);

		            };		

		a1.printNumber(20);

	}

}