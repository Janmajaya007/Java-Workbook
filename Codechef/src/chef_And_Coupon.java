import java.util.Scanner;

public class chef_And_Coupon {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int  t=sc.nextInt();
 while(t-->0) {
	 int D=sc.nextInt();
	 int C=sc.nextInt();
	 int sum1=0;
	 int sum2=0;
	 
	 int arr1[]=new int [3];
	 for(int i=0;i<3;i++) {
		 arr1[i]=sc.nextInt();
	 }
	 int arr2[]=new int [3];
	 for(int i=0;i<3;i++) {
		 arr2[i]=sc.nextInt();
	 }
	  for(int i=0;i<3;i++) {
		  sum1+=arr1[i]; 
			 sum2+=arr2[i];
	  }
	 if(sum1>150 && sum2>150) {
		 if(2*D>C) {
			 System.out.println("YES");
		 }
		 else {
			 System.out.println("NO");
		 }
	 }
	 else {
		 System.out.println("NO");
	 }
	
 }
 sc.close();
	}

}
