package collections;
import java.util.*;
public class UserInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Bazaar ba=new Bazaar();
		ba.setPolicyMap(new TreeMap<Integer, String>());
		System.out.println("Enter the no of Policy names you want to store");
		int n = sc.nextInt();
		for(int i=0; i<n ;i++) {
			System.out.println("Enter the Policy ID");
			int policyId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Policy Name");
			String policyName = sc.nextLine();
			ba.addPolicyDetails(policyId, policyName);
		}
		 Map<Integer, String> bazaar = ba.getPolicyMap();
		for (Map.Entry<Integer, String> map_1 : bazaar.entrySet()) {
			 System.out.println(map_1.getKey()+" "+map_1.getValue());
		}
		System.out.println("Enter the policy type to be searched");
		String searchId = sc.nextLine();
		List <Integer> li = ba.searchBasedOnPolicyType(searchId);
		for(int i: li)
			System.out.println(i);
		
		sc.close();
	}

}
