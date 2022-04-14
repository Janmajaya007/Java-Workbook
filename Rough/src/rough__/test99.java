package rough__;

import java.util.Scanner;

public class test99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long power = (long) Math.pow(n, m);
		int num = 0;
		while (k > 0) {
			num = (int) (power % 10);
			power = power / 10;
			k--;
		}
		System.out.println(num);
		sc.close();
	}
}
