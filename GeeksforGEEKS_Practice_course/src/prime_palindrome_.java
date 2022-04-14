import java.util.Scanner;

public class prime_palindrome_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter t");
		int t = sc.nextInt();
		while (t-- > 0) {
			System.out.println("Enter the L");
			int l = sc.nextInt();
			System.out.println("Enter the R");
			int r = sc.nextInt();
			System.out.println();
			int n=primePalindrome(l, r);
			System.out.println(n);
		}
	}

	private static int  primePalindrome(int l, int r) {
		int i, j, flag, count=0;
		for (i = l; i <= r; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;
			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				if (palindrome(i) == true) {
					 count++;
				}
			}
		}
		return count;
	}

	public static boolean palindrome(int num) {

		String str = Integer.toString(num);
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				return false;
		}
		return true;
	}
}
