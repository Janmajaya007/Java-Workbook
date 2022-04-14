 abstract class A{
	A(){
		System.out.println("A");
	}
}
class B extends A{
	B(){
		System.out.println("B");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a = new A();
A aa = new B();
B b= new B();
B bb = new A();

	}

}
