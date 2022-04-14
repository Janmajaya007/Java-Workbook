package solid_principles;
import solid_principles.interfaces.IOrder;
public class Order implements IOrder {
	@Override
	public void processOrder(String name) {
		System.out.println(name+" order accepted!");
	}
}
