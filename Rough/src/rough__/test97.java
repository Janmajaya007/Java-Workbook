package rough__;

import java.util.*;

public class test97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = Integer.parseInt(str);
		int[] arr = new int[str.length()];
		int rem = 0;
		int i = 0;
		while (num > 0 && i < str.length()) {
			rem = num % 10;
			arr[i] = rem;
			num = num / 10;
			i++;
		}
		int sum = 0;
		for (int j = 0; j < str.length() - 1; j++) {
			for(int l=0;l<str.length();l++) {
			sum = arr[j] + arr[l];
			if (sum == 17) {
				arr[j] = 0;
				arr[l] = 0;
				j++;
			}
			sum = 0;
		}
		}
		int c = 0;
		for (int k : arr) {
			if (k != 0)
				c++;
		}
		System.out.println(c);
	}
}
