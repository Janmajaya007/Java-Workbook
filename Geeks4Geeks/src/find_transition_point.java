import java.util.Scanner;

public class find_transition_point {
	
	
	private static int transition_point(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			while(arr[i]==1) {
				return i;
				
			}
			
		}
		return -1;
 		 
	}
	
	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr []=  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		 System.out.println(transition_point(arr, n));
		 sc.close();
	}

	

}
