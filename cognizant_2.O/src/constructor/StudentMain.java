package constructor;
import java.util.*;
class Student {
	private int studentId;
	private String studentName, studentAddress, collegeName;
	
	Student(int studentId, String studentName, String studentAddress ){
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
		this.collegeName="NIT";
	}
	
	Student(int studentId, String studentName, String studentAddress, String collegeName){
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
		this.collegeName=collegeName;
	}
	
	public int getStudentid() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getAddress() {
		return studentAddress;
	}
	public String getCollegeName() {
		return collegeName;
	} 
}
public class StudentMain {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Student's Id:");
	       int studentId=sc.nextInt();
	       sc.nextLine();
	       
	       System.out.println("Enter Student's Name:");
	       String studentName=sc.nextLine();
	       
	       System.out.println("Enter Student's address:");
	       String studentAddress=sc.nextLine();
	       
	       while(true)
	       {
	            System.out.println("Whether the student is from NIT(Yes/No):");
	            String answer=sc.nextLine();
	       
	            if(answer.equalsIgnoreCase("yes"))
	            {
	                Student obj = new Student(studentId, studentName, studentAddress);
	                System.out.println("Student id:"+obj.getStudentid());
	                System.out.println("Student name:"+obj.getStudentName());
	                System.out.println("Address:"+obj.getAddress());
	                System.out.println("College name:"+obj.getCollegeName());
	                break;
	            }
	           
	            else if(answer.equalsIgnoreCase("no"))
	            {       
	                System.out.println("Enter the college name:");
	                String collegename=sc.nextLine();
	                
	                Student obj = new Student(studentId, studentName, studentAddress, collegename);
	                
	                System.out.println("Student id:"+obj.getStudentid());
	                System.out.println("Student name:"+obj.getStudentName());
	                System.out.println("Address:"+obj.getAddress());
	                System.out.println("College name:"+obj.getCollegeName());
	                break;
	            }
	            
	            else
	            {
	                System.out.println("Wrong Input");
	            }
	       }
	}
}
