import java.util.Scanner;

public class serting_of_zeroes_to_end {

	
	private static void shorting(int[] arr, int n) {
		
		 int c=0; int d=0;
	       for(int i=0;i<n-1;i++){
	           if(arr[i]<=arr[i+1]){
	               c++;
	           }
	           else if (arr[i]>=arr[i+1]){
	               d++;
	           }
	       }
		System.out.println(c);
		System.out.println(d);
 		 
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr []=  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		 shorting(arr, n);
		 sc.close();
	}


}
