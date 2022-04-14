package Runnable_Interface_implemetation;

public class test {
	public static void main(String[] args) {
//		Runnable r =new Runner();
//		Thread t = new Thread(r);
//		t.start();
		Runnable ru = () -> {

			for (int i = 0; i < 10; i++) {
				System.out.println("Janmajaya You can do it....!!!!!");
			}
		};
		Thread t = new Thread(ru);
		t.start();
	}
}
