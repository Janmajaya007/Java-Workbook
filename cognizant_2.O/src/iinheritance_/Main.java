package iinheritance_;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Hosteller h=new Hosteller();
		h=getHostellerDetails();
		System.out.println("The Student Details");
		System.out.println(h.getStudentid()+" "+h.getName()+" "+h.getDepartmentid()+
				" "+h.getGender()+" "+h.getPhone()+" "+h.getHostelName()+" "+h.getRoomNumber()+" ");
	}
	public static Hosteller getHostellerDetails() {
		Scanner sc= new Scanner(System.in);
		Hosteller H=new Hosteller();
		System.out.println("Enter the Details:");
		System.out.println("Student Id");
		int sid=sc.nextInt();
		
		System.out.println("Student Name");
		sc.nextLine();
		String name= sc.nextLine();
		
		System.out.println("Department Id");
		int did=sc.nextInt();
		 
		System.out.println("Gender");
		sc.nextLine();
		String gender =sc.nextLine();
		
		System.out.println("Phone Number");
		String phone= sc.nextLine();
		 
		System.out.println("Hostel Name");
		String hname =sc.nextLine();
		
		System.out.println("Room Number");
		int rno=sc.nextInt();
		
		H.setStudentid(sid);
		H.setName(name);
		H.setDepartmentid(did);
		H.setGender(gender);
		H.setPhone(phone);
		H.setHostelName(hname);
		H.setRoomNumber(rno);
		
		System.out.println("Modify Room Number(Y/N)");
		char ch1=sc.next().charAt(0);
		if(ch1=='Y') {
			System.out.println("New Room Number");
			int roomNo=sc.nextInt();
			H.setRoomNumber(roomNo);
		}
		
		System.out.println("Modify Phone Number(Y/N)");
		char ch2=sc.next().charAt(0);
		if(ch2=='Y') {
			System.out.println("New Phone Number");
			sc.nextLine();
			String phone_= sc.nextLine();
			H.setPhone(phone_);
		}
		sc.close();
		return H;
	}

}
