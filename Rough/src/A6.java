import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ar[] = sortArray(arr);
		for (int k : ar) {
			System.out.print(k + " ");
		}
	}

	public static int[] sortArray(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int x = 0; x < n - 1; x++) {
			int index_of_min = x;
			for (int y = x + 1; y < n; y++)
				if (arr[y] < arr[index_of_min])
					index_of_min = y;
			int temp = arr[index_of_min];
			arr[index_of_min] = arr[x];
			arr[x] = temp;
		}
		return arr;
	}

}
