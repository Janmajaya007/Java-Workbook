import java.util.*;
public class removeThirdElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> str = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			String s = sc.next();
			str.add(s);
		}
		str.remove(2);
		for (String ss : str)
			System.out.println(ss);
	}
}
