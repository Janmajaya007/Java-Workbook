package skill;

import java.util.List;

public class test {

	public static void main(String[] args) {
	 List <String> name = List.of("Janmajaya", "Janma","Sambhu");
	 printTheString(name);
	 printfunction( name);

	}

	public static void printTheString(List<String> name) {
		for (String names:name) {
			 System.out.println(names);
		 }
	}

	public static void printfunction(List<String> name) {
		name.stream().forEach(
				element -> System.out.println("element -"+element));
				 
		 }
	

}