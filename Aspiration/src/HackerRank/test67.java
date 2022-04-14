package HackerRank;

import java.util.Scanner;

public class test67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int c = sc.nextInt();
		String str = sc.next();
		String ans = findcost(t, c, str);
		System.out.println(ans);
	}
	public static String findcost(int t, int c, String str) {
		// TODO Auto-generated method stub
		String ans = "No";
		double th;
		double qc;
		if (str.equals("standard")) {
			th = 0.3 * t;
			qc = c / th;

			if (qc < 1)
				ans = "Yes";
		}
		if (str.equals("custom")) {
			th = 0.1 * t;
			qc = c / th;

			if (qc < 1)
				ans = "Yes";

		}
		return ans;
	}

}
