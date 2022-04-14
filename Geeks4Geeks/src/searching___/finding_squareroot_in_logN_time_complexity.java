package searching___;

import java.util.Scanner;

public class finding_squareroot_in_logN_time_complexity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find SquareRoot");
		long num = sc.nextLong();
		long Annswer = squareRoot(num);
		System.out.println(Annswer);
		sc.close();
	}

	public static long squareRoot(long num) {
		long low = 1, high = num, ans = 0;
		while (low <= high) {
			long mid = (low + high) / 2;
			long square = mid * mid;
			if (square == num)
				return mid;
			else if (square < num) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

}
