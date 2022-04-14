package functional_Programing;

import java.util.List;

public class print_sum_of_numbers {

	public static void main(String[] args) {
		 List <Integer> number = List.of (20,54,87,65,98,32,15);
		 /*number.stream().forEach(element-> System.out.println(element));*/
		 int sum = number.stream().filter(numbers -> numbers%2==0).reduce(0,(number1, number2)-> number1+number2);
		 System.out.println("Sum of the number is"+ sum);
		 
	}

}
