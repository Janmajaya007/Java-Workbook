import java.util.*;
import java.util.List;
import java.util.Scanner;

public class t56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int d = sc.nextInt();
		int l = s.length();
		answer(l, d, s);

	}

	private static List<String> answer(int n, int d, String s) {
		// TODO Auto-generated method stub
		String left = s.substring(0, d);
		String right = s.substring((n - d), n);
		String leftrotate = s.substring(d) + left;
		String rightrotate = right + s.substring(0, n - d);

		List<String> str = new ArrayList<>();
		str.add(leftrotate);
		str.add(rightrotate);
		return str;

	}

}
