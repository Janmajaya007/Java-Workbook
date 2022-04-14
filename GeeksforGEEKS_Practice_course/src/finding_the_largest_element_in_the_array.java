import java.util.Scanner;

public class finding_the_largest_element_in_the_array {

	
	public static int largest_element(int[] arr, int n) {
		int max=0; 
 for(int i=0;i<n;i++) {
	 if(arr[i]>max) {
		 max=arr[i];
	 }
 }
		return max;
	}
	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr []=  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		 System.out.println(largest_element(arr, n));
		 sc.close();
	}
}
