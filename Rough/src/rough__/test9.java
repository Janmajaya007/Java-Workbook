package rough__;

abstract class  name{
//	 String nam;
//	 int num;
//	 int age;
	 public name(){
//		 this.nam=nam;
//		 this.num=num;
//		 this.age=age;
		 System.out.println("Abstract");
	 }
	// public abstract void school();
 }
class people extends name{
	//String address;
	people(){
//		super(nam, num, age);
//		this.address=address;
		System.out.println("Child");
	}
//	public void school() {
//		System.out.println("My school name is MVM");
//	}
//	public void addres() {
//		 
//		System.out.println(this.nam);
//		System.out.println(this.num);
//		System.out.println(this.age);
//		System.out.println(this.address);
//	}
}
public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
people p=new people();
//p.school();
//p.addres();
	}

}
