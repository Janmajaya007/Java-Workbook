package ioStream;

import java.io.*;

public class fileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream(
					("C:\\Users\\janmajaya gantayat\\OneDrive\\Desktop\\Janmajaya Gantayat.jpg"));
			fout = new FileOutputStream( 
					("C:\\Users\\janmajaya gantayat\\OneDrive\\Desktop\\image1.jpg"));
			
			int data;
			while((data = fin.read())!= -1)
				fout.write(data);
				System.out.println("file Copied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Copied Successfully");
	}

}
