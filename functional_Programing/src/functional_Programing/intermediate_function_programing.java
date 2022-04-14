package functional_Programing;

import java.util.List;
import java.util.stream.IntStream;

public class intermediate_function_programing {

	public static void main(String[] args) {
		 List <Integer> num= List.of(12,23,34,45,24,12,13,14,23,24,34,56,45,56,67,78,89,10,20,30,40,50,60,3,0256,5,1,4,8,7,2,6,9);
		 num.stream().distinct().sorted().forEach(e-> System.out.println(e));
		 
		 List.of("APPLE","CAR","DOG", "NUMBER").stream().map(e-> e.toLowerCase()).forEach(p-> System.out.println(p));
		 List.of("APPLE","CAR","DOG", "NUMBER").stream().map(e-> e.length()).forEach(p-> System.out.println(p));
		IntStream.range(0, 11).map(e-> e*e).forEach(p-> System.out.println(p));
	}

}
