import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ar[]=manchester(arr);
		for(int k:ar) {
			System.out.print(k+" ");
		}
	}

	private static int[] manchester(int[] arr) {
		// TODO Auto-generated method stub
		int len=arr.length;
		int res[]=new int[len];
		boolean result;
		res[0]=arr[0];
		for(int i=1;i<len;i++) {
			result=(arr[i]==arr[i-1]);
			res[i]=(result)? 0:1;
		}
		return res;
	}

}
