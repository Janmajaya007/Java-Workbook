package union_and_intersection_;

import java.util.Scanner;

public class st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in);
 String str=sc.nextLine();
  
 System.out.println(findMax(str));
 }
 public static int max=256;
	private static String findMax(String str) {
		// TODO Auto-generated method stub
		int count[] = new int[max];
		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1, c = 0;
		char result = ' ';

		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		for (int s : count) {
			if (s == max) {
				c++;
			}
		}
		if (c > 1) {
			return "0";
		}
		String s = Character.toString(result);
		return s;
	}

}
