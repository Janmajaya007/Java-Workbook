package Functions_;

import java.util.Scanner;
import java.util.function.Function;

public class lengthOfString {

	public static void main(String[] args) {
		
		Function <String, Integer> fs = s->(s.length());
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of String to Enter for Length Maping");
		int n= sc.nextInt();
		sc.nextLine();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextLine();
		}
		for(int i=0;i<n;i++) {
			System.out.println("the length of "+arr[i]+" is "+fs.apply(arr[i]));
		}
		sc.close();
	}

}
