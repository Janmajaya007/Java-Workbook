import java.io.*;
import java.util.*;
public class Java_String_Token {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count=0;
        ArrayList <String> stringlist =new  ArrayList<String>();
        // Write your code here.
        String st[ ] =s.split(" ");
        for(String ss:st) {
        	 String ss1 []= ss.split("[!,?._'@ ]" );
        	 for(String finalstring : ss1) {
        		 count++;
        		 stringlist.add(finalstring);
        	 }
        	 
        }
        System.out.println(count);
        for(int i=0; i< stringlist.size();i++) {
        	System.out.println(stringlist.get(i));
        }
   	 scan.close();
	}

}
