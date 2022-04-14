import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ar[] = replaceValues(arr);
		for (int k : ar) {
			System.out.print(k + " ");
		}
	}

	public static int[] replaceValues(int[] arr) {
		// TODO Auto-generated method stub
		int i, j, len = arr.length;
		if (len % 2 == 0) {
			for (i = 0; i < len; i++)
				arr[i] = 0;
		} else {
			for (j = 0; j < len; j++)
				arr[j] = 1;
		}
		return arr;
	}

}
