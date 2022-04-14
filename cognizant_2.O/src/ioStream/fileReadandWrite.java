package ioStream;
import java.io.*;

public class fileReadandWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr =null;
		FileWriter fw = null;
		
		fr= new FileReader("C:\\Users\\janmajaya gantayat\\OneDrive\\Desktop\\myText.txt");
		fw= new FileWriter("C:\\Users\\janmajaya gantayat\\OneDrive\\Desktop\\myText1.txt");
		
		int ch;
		
		while((ch = fr.read())!= -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
