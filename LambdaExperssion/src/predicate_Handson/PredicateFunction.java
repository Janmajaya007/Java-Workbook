package predicate_Handson;

import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) {
		
		int arr[] = {12, 525, 782, 62, 56, 63, 956, 568, 588, 52};
		
		Predicate <Integer> p1 = i->(i > 99);
		Predicate <Integer> p2 = j->(j%2 ==0);
		
		System.out.println("Number greater than 99");
		method1(p1, arr);
		System.out.println();
		System.out.println("These are even number");
		method1(p2, arr);
		System.out.println();
		System.out.println("Number less than 99");
		method1(p1.negate(), arr);
		System.out.println();
		System.out.println("Number greater than 99 and even");
		method1(p1.and(p2), arr);
		System.out.println();
		System.out.println("Number greater than 99 or even");
		method1(p1.or(p2), arr);
		
		
	}
	
	static void method1(Predicate<Integer> p, int arr []) {
		for(int i=0;i<arr.length;i++) {
			if(p.test(arr[i]))
				System.out.println(" "+ arr[i]);
		}
	}
}
