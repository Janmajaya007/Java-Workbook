package rough__;

import java.util.*;

public class test98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] s = str.split(" ");
		int pre = 1;
		int size = s.length;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int sum = 1;
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				sum = sum + 1;
			} else if (arr[i] < arr[i + 1]) {
				pre = pre + 1;
				sum = sum + pre;
			}
		}
		System.out.println(sum);

	}

}
