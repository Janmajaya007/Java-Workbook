 
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class list {

	public static void main(String[] args) {
		List<Character> letter =      List.of ('a', 'f', 'A', 's', 'w', 'A', 'Z', 'A', 'O');
		Set<Character> letters = new TreeSet<>(letter);
		System.out.println(letters);
	}

}
