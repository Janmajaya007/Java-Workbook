package ioStream;
import java.io.*;
public class testSerializable {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo =null;
		ObjectOutputStream os = null;
		
		fo = new FileOutputStream("C:\\Users\\janmajaya gantayat\\OneDrive\\Desktop\\Emp.ser");
		os= new ObjectOutputStream(fo);
		
		
		Serializable_ obj =new Serializable_(1, "John", "Kolkata", 12345);
		os.writeObject(obj);
		System.out.println("Object is serializable");
	}

}
