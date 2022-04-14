import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int val = sc.nextInt();
		int count = countOccurance(arr, val);
		System.out.println(count);
	}

	public static int countOccurance(int[] arr, int val) {
		// TODO Auto-generated method stub
		int i = 0, count = 0, len = arr.length;
		while (i < len) {
			if (arr[i] == val)
				count += 1;

			i++;
		}
		return count;
	}

}
