import java.util.ArrayList;
import java.util.Scanner;

public class marks_problem {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 
		
		 while(T-->0) {
			 int total=0;
			 int N=sc.nextInt();
			 int K=sc.nextInt();
			 int arr[]= new int[K];
			 String  mark[]= new String[N];
			 for(int i=0;i<K;i++) {
				 arr[i]=sc.nextInt();
			 }
			 
			 for(int i=0;i<N;i++) {
				 mark[i]=sc.next();
			 }
			 
			 for(int i=0;i<N;i++) {
				 String s=mark[i];
				 for(int j=0;j<K;j++) {
					 total+= Integer.parseInt(Character.toString(s.charAt(j)))*arr[j]; 
				 }
				 System.out.println(total);
				 total=0;
			 }
			 
		 }
		 sc.close();

	}

}
