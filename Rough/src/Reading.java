
import java.io.*;

 public class Reading {

 public static void main(String[] args) {

 String s;

 try {

	 FileReader fr = new FileReader("D:/input.txt");

	 BufferedReader br = new BufferedReader(fr);

	 while((s = br.readLine()) != null)

	 System.out.println(s);

     } 

 catch (IOException e)

 	{ 

	 System.out.println("io error"); }

 	}

}