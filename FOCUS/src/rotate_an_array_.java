import java.util.Scanner;

public class rotate_an_array_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		System.out.println("Enter the array");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the array rotate times");
		int k = sc.nextInt();
		rotateArray(arr, n, k);
		sc.close();
	}

	public static void rotateArray(int[] arr, int n, int d) {
		// TODO Auto-generated method stub
//		int temp = 0;
//		while (d-- > 0) {
//			int i;
//			temp = arr[0];
//			for (i = 0; i < n - 1; i++) {
//				arr[i] = arr[i + 1];
//			}
//			arr[i] = temp;
//		}
//		for (int a : arr)
//			System.out.print(a + " ");
		
        int temp[] = new int[d];
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        } 
        for (int a : arr)
 		System.out.print(a + " ");
	}
}
