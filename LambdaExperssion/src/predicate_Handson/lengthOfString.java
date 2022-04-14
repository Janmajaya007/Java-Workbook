package predicate_Handson;

import java.util.function.Predicate;

public class lengthOfString {

	public static void main(String[] args) {
		Predicate <String> p = str ->(str.length() >5);
		
		System.out.println(p.test("JAnamjaya"));
		System.out.println(p.test( "Naidu"));
	}

}
