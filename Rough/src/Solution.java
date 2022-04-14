 import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
    	
        String smallest = "";
        String largest = "";
        ArrayList<String> substring =new ArrayList<>();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0; i<(s.length()-(k-1));i++) {
        	String sub=s.substring(i, i+k);
        	 substring.add(sub);
        	
        }
         
        Collections.sort(substring);
        smallest=substring.get(0);
        largest=substring.get(substring.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scan.next();
        System.out.println("Enter the size of sub string");
        int k = scan.nextInt();
        scan.close();
        getSmallestAndLargest(s, k);
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}