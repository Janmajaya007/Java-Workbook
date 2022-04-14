package placement_coding;
import java.util.Arrays;
import java.util.Scanner;

public class java_Anagrams {

	static void isAnagram(String a, String b) {
        // Complete the function
       // import java.util.Arrays;
    String s1=a.toLowerCase();
     String s2=b.toLowerCase();
     char []arr1 = s1.toCharArray(); 
        Arrays.sort(arr1); 
        char []arr2 = s2.toCharArray(); 
        Arrays.sort(arr2); 
        if(String.valueOf(arr1).compareTo(String.valueOf(arr2))==0)
        {
        	System.out.println("Anagrams");
        }
        else 
        {
        	System.out.println("Not Anagrams");
        }   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String1");
        String a = scan.next();
        System.out.println("Enter the String2");
        String b = scan.next();
         isAnagram(a, b);
	}

}
