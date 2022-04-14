import java.util.Scanner;

public class light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the no of lights");
Scanner sc= new Scanner (System.in);
int n=sc.nextInt();
 int sum=0;
 int start[]=new int[n];
 int end[]=new int[n];
 for(int i=0;i<n;i++) {
	 start[i]=sc.nextInt();
	 end[i]=sc.nextInt();
	 sum+=end[i]-start[i];
 }
 for(int i=0; i<n-1;i++) {
	 if(start[i+1]<end[i]) {
		 sum-=(end[i]-start[i+1]);
	 }
 }
 System.out.println(sum);
	}

}
