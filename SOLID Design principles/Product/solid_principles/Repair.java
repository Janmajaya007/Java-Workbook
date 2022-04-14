package solid_principles;

import solid_principles.interfaces.IRepair;

public class Repair implements IRepair {

	@Override
	public void processPhoneRepair(String phoneName) {
		System.out.println(phoneName + " repair accepted!");
	}

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType + " repair accepted");
	}

}
