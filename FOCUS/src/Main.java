class parent{
	public void print() {
		System.out.println("Parent");
	}
	public void show() {
		System.out.println("mother");
		System.out.println("GrandMother");
	}
}
class child extends parent{
	public void show() {
		System.out.println("Child");
	}
	public void see() {
		System.out.println("wife");
	}
}
 class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent p=new parent();
child c=new child();
parent s=new child();
//child t=(child) new parent();
System.out.println("Parent reference parent object");
 p.print();
 p.show();
 //p.see(); parent class cannot call child class methods
 System.out.println();
 System.out.println("child reference child object");
 c.see();
 c.show();
 c.print(); //child class can call all the methods of parent class
 System.out.println();
 System.out.println("Parent reference child object");
 s.print();
 s.show();
 //s.see();
 
// t.print();
// t.show();
// t.see();
	}

}
