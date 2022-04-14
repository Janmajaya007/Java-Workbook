package rough__;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(n);
	}

	private static void printPattern(int num) {
		// TODO Auto-generated method stub
		int i, print = 0;
		if (num % 2 == 0) {
			print = 0;
			for (i = 0; i < num; i++) {
				System.out.print(print + " ");
				print += 2;
			}
		} else {
			print = 1;
			for (i = 0; i < num; i++) {
				System.out.print(print + " ");
				print += 1;
			}
		}
	}
}
