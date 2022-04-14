import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class missing_element_of_array {
	private static int missing_element(int[] array, int n) {
		 int i, total, sum=0;
			total = (n + 1) * (n + 2) / 2;
			for (i = 0; i < n; i++)
				sum += array[i];
			return (total-sum);
	        
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr []=  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		 System.out.println(missing_element(arr, n));
		 sc.close();
	}

	

}
