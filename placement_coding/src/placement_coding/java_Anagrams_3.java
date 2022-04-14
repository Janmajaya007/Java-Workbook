  package placement_coding;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class java_Anagrams_3 {
// Remove minimum number of characters so that two strings become anagram
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
     int s1[]= new int[26];
     int s2[]= new int[26];
      for(int i=0; i<a.length(); i++){
          int index =a.charAt(i)-'a';
          s1[index]++;
      }
      for(int i=0; i<b.length(); i++){
          int index =b.charAt(i)-'a';
          s2[index]++;
      }
         int r=0;
         for(int i=0; i<26; i++){
             r+=Math.abs(s1[i]-s2[i]);
         }  
         return r;    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
