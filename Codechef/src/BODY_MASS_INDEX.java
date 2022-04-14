import java.util.Scanner;

public class BODY_MASS_INDEX {

	
	 
	
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 int index=0;
		 while(T-->0) {
		 int M=sc.nextInt();
		 int H=sc.nextInt();
		 index=M/(H*H);
		 
		 if(index<=18) {
			 System.out.println("1");
		 }
		 else if(index>=19 && index<=24) {
			 System.out.println("2");
		 }
		 else if(index>=25 && index<=29) {
			 System.out.println("3");
		 }
		 else if(index>=30) {
			 System.out.println("4");
		 }
		 
		 }
index=0;
sc.close();
	}

	

}
