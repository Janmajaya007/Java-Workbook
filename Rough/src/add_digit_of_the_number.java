import java.util.Scanner;

public class add_digit_of_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number");
 int n=sc.nextInt();
 int sum=0;
 while(n>0) {
	 int r=n%10;
	 sum+=r;
	 n=n/10;
 }
 System.out.println(sum);
	}

}
