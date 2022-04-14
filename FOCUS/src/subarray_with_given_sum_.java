import java.util.*;

public class subarray_with_given_sum_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("Enter the arr1");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter sum");
		int sum = sc.nextInt();
		System.out.println(subarraySum(arr, n, sum));

	}

	public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		int   left = 0,right=0,  sum = 0;
		ArrayList<Integer> ar=new ArrayList<>();
		while(sum!=s)
		{
			sum=sum+arr[right];
			if(sum>s)
			{
				sum=sum-arr[left];
				left++;
			}
			else if(sum<s)
			{
				right++;
			}
		}
		 ar.add(left+1);
		 ar.add(right+1);
		 return ar;
		 
	}
}
