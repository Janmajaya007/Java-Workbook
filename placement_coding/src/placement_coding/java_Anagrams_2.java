 package placement_coding;
import java.util.Scanner;

public class java_Anagrams_2 {

	static boolean isAnagram(String a, String b) {
		a=a.toLowerCase();
	     b=b.toLowerCase();
	      int arr[] =new int[26];
	      for(int i=0; i<a.length(); i++){
	          int index = a.charAt(i)-'a';
	          arr [index]++;
	      }
	      for(int i=0; i<b.length(); i++){
	          int index = b.charAt(i)-'a';
	          arr [index]--;
	      }
	      for(int i=0; i<26; i++){
	          if(arr[i]!=0){
	          return false;
	          }
	           
	      }
	      return true ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String1");
        String a = scan.next();
        System.out.println("Enter the String2");
        String b = scan.next();
        boolean ret = isAnagram(a, b);
          System.out.println((ret)? "Anagrams": "Not Anagrams" );
	}

}
