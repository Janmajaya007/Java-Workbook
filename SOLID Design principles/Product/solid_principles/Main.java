package solid_principles;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String option = sc.nextLine();
		if(option.equalsIgnoreCase("order")){
			System.out.println("Please provide the phone model name");
			String name = sc.nextLine().trim();
			new Order().processOrder(name);
		}else if(option.equalsIgnoreCase("repair")) {
			System.out.println("Is it the phone or accessory that you want to be repaired?");
			String repairType = sc.nextLine();
			if(repairType.equalsIgnoreCase("phone")) {
				System.out.println("Please provide the phone model name");
				new Repair().processPhoneRepair(sc.nextLine().trim());
			}else if(repairType.equalsIgnoreCase("accessory")) {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				new Repair().processAccessoryRepair(sc.nextLine().trim());
			}
		}
		sc.close();
	}
}
