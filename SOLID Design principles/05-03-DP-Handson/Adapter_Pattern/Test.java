package Adapter_Pattern;

public class Test {
	public static void whenConvertingMPHtoKMPH_thenSuccessfullyConverted() {
		
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		
		System.out.println("Speed in Mph: " + bugattiVeyron.getSpeed());
		
		System.out.println("Pricr in USD: " + bugattiVeyron.getPrice());
		
		System.out.println("Speed in kmph: " + bugattiVeyronAdapter.getSpeed());
		
		System.out.println("Price in Euro: " + bugattiVeyronAdapter.getPrice());
		
	}

	public static void main(String[] args) {
		
		whenConvertingMPHtoKMPH_thenSuccessfullyConverted();
	}
}
