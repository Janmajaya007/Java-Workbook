package ioStream;

import java.io.*;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi =new FileInputStream("C:\\Users\\janmajaya gantayat\\OneDrive\\Desktop\\Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fi);		
	
		Object obj = ois.readObject();
		Serializable_ emp = (Serializable_) obj;

		System.out.println("Employee Id: " + emp.id);
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee office: " + emp.office);
		System.out.println("Employee SID: " + emp.sid);
	}

}
