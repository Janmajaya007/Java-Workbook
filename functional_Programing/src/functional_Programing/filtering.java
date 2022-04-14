package functional_Programing;

import java.util.List;

public class filtering {

	public static void main(String[] args) {
	List <String> Alphabe = List.of ("Apple","Bat","Cat","Rat");
	 fil(Alphabe);
	 filter(Alphabe);
 }
	private static void fil(List<String> Alphabe) {
		for(String alphabet: Alphabe)
			System.out.println(alphabet);
		System.out.println();
		System.out.println("Noe the Filter method will execute");
		
	}
	private static void filter (List<String> Alphabe) {
		Alphabe.stream().filter(element-> element.endsWith("at")).forEach(element-> System.out.println("Element- "+ element));
	}
}
 