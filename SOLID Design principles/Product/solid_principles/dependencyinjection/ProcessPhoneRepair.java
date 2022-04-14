package solid_principles.dependencyinjection;
import solid_principles.interfaces.IPhone;
//This class is a concrete one that couldn't be changed
public class ProcessPhoneRepair {
	/*
	 * Method List the steps in a phone's repair
	 * Any phone model that implements all the methods of the interface IPhone can be inserted as dependency to this method.
	 * This would be common set of steps in repair
	 */
	//That's why making this method as static so that no other class could override the method
	public static void repairSteps(IPhone phone) {
		String part1 = phone.getPhonePart1();
		System.out.println(part1 + " repaired!");
		double cost = phone.getPart1Cost();
		System.out.println("Repair cost = "+cost*0.5);
	}
}
