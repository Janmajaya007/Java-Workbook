package collections;
import java.util.*;
@SuppressWarnings("unchecked")
public class UniqueWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Article");
		String s = sc.nextLine();
		String str = s.toLowerCase();
		String arr[]= str.split("[\\s,;:.?!]+");
		int n= arr.length;
		System.out.println("Number of words "+n);
		Arrays.sort(arr,String.CASE_INSENSITIVE_ORDER);
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		int un=linkedset.size();
		System.out.println("Number of unique words "+un);
		for(int i=0; i<arr.length ;i++) {
			linkedset.add(arr[i]);
		}
 		int i=1;
 		System.out.println("The words are");
 		for(String unique: linkedset)
 			System.out.println(i++ +"."+unique);
		sc.close();
	}
}
/*
[hello, 
everybody,
 welcome, 
 to, 
 collection,
  in, 
  java, 
  is, 
  like, 
  a, 
  container,
   and,
    powerful,
     concept]
*/