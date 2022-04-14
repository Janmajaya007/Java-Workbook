import java.util.Scanner;

public class find_key {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int input1=sc.nextInt();
		 int input2=sc.nextInt(); 
		 int input3=sc.nextInt();
		 int max=0;
		 String str1=Integer.toString(input1);
		 String str2=Integer.toString(input2);
		 String str3=Integer.toString(input3);
		 
		 int a=Integer.parseInt(String.valueOf(str1.charAt(0)));
		 int b=Integer.parseInt(String.valueOf(str2.charAt(1)));
		 
		 for(int i=0; i<4;i++) {
			 int c=Integer.parseInt(String.valueOf(str3.charAt(i)));
			 if(c>max)
				 max=c;

		 }
		 int key=(a*b)-max;
		 System.out.println(key);
	}

}
