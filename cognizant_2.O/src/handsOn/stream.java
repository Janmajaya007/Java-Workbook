package handsOn;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class stream {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter all roll numbers separated by comma");
		String str=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the department name acronym");
		String dept=sc.next();
		if ( stream.getCount(stream.getRollNumbers(str), dept)>0) {
			System.out.println("Number of students in me is " + stream.getCount(stream.getRollNumbers(str), dept));
		}
		else
		{
			System.out.println("No students from "+dept);
		}
		sc.close();
	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		
		String str []=rollNumbers.split(",");
		Stream<String> stm = Arrays.stream(str);
		return stm;
	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here
		List<String> department = rollNumberStream.map(s->s.substring(0,2)).collect(Collectors.toList());
		int count=0;
		for(String s: department) {
			if(s.equalsIgnoreCase(dept))
				count++;
		}
		return count;

	}

}
