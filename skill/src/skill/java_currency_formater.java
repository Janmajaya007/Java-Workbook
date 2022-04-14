package skill;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class java_currency_formater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
     
        String us=  NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india=  NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String China=  NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String France=  NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + China);
        System.out.println("France: " + France);
	}

}
