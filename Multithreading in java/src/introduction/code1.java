package introduction;
 
class task1 extends Thread{
	public void run() {
		 System.out.println(" T1 starts ");
		for(int i=0;i<100;i++) 
			System.out.print(i+" ");
		System.out.println();
		System.out.println(" T1 end");
	}
}
class task2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
	 	System.out.println("T2 starts");
		 for(int i=100;i<200;i++) {
				System.out.print(i+" ");
			}
		 System.out.println();
		  System.out.println("T2 end"); 
	}
	
}
public class code1 {
	public static void main(String[] args) throws InterruptedException {
		
		
		//task1
		 System.out.println("Task1 kicked off");
		task1 t1=new task1();
		t1.setPriority(10);//this setPriority() method used to set High priority of execution to task1 method
		// 10= High priority
		//5= medium priority
		//1= low priority
		t1.start();
	    System.out.println("Task1 stops executing");
		 
		 
	   //task2
		 System.out.println("Task2 kicked off");
		 task2 t2=new task2();
		 Thread t2thread=new Thread(t2);
		 t2thread.setPriority(1);//this setPriority() method used to set low priority of execution to task2 method
		 t2thread.start();
		 System.out.println("Task2 stops executing");
		 
		 t1.join();  //this join method to make task1 end first before execution of task3
		 t2thread.join(); //this join method to make task2 end first before execution of task3
		 
		 //task3
		 System.out.println("Task3 kicked off");
		 System.out.println("T3 starts");
		 for(int i=100;i<200;i++) {
				System.out.print(i+" ");
			}
		 System.out.println();
		  System.out.println("T3 end"); 
		 System.out.println("Task3 stops executing");
		 
		 
		 
		 
		 System.out.println("Main End");

	}

}
