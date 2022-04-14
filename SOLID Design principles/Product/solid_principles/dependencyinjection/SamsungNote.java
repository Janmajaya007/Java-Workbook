package solid_principles.dependencyinjection;
import solid_principles.interfaces.IPhone;
public class SamsungNote implements IPhone{

	@Override
	public String getPhonePart1() {
		return "Display";
	}

	@Override
	public double getPart1Cost() {
		return 500;
	}
	
}
