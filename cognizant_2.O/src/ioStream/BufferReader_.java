package ioStream;

import java.io.*;
import java.util.*;

public class BufferReader_ {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("C:\\Users\\janmajaya gantayat\\OneDrive\\Desktop\\myText.txt");
			br = new BufferedReader(fr);
			int count = 0;
			String line;
			try {
				while ((line = br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(line);
					while (st.hasMoreTokens()) {
						System.out.println(st.nextToken());
						count++;
					}
				}
				System.out.println("The niomner of words are " + count);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
