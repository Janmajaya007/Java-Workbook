package predicate_Handson;
import java.util.function.Predicate;
public class greaterThanNumber {

	public static void main(String[] args) {
		Predicate<Integer> p= i->(i>25);
		
		System.out.println(p.test(25));
		System.out.println(p.test(30));
		System.out.println(p.test(95));
		System.out.println(p.test(15));
		
	}

}
