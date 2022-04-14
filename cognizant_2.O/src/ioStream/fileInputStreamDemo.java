package ioStream;

import java.io.*;

public class fileInputStreamDemo {

	public static void main(String[] args) {

		FileInputStream files = null;
		try {
			files = new FileInputStream(new File("C:\\Users\\janmajaya gantayat\\OneDrive\\Desktop\\myText.txt"));
			System.out.println("File Opened");

			int i;
			while ((i = files.read()) != -1) {
				System.out.print((char) i);
			}
			files.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				files.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File Closed");
		}
	}

}
