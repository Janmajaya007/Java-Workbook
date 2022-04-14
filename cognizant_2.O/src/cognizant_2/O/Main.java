package cognizant_2.O;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Fill the code here
		int n = sc.nextInt();
		n=n+1;
		String arr[] = new String[n];
		for (int i = 0; i< n; i++) {
			String s=sc.nextLine();
			arr[i] = s;
		}
		 
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			
			  percentage(arr[i]);
		}
		 
		sc.close();
	}
	public static void percentage(String str) {
//		String st[] = s.split(",",3);
		 
		int percent = Integer.parseInt(st[2]);
		int amount = Integer.parseInt(st[1]);
		int discount = (percent  * amount)/100;
		System.out.println(percent);
		System.out.println(amount);
		System.out.println(discount);
	}
}
//4
//mobile,10000,20
//shoe,5000,10
//watch,6000,15
//laptop,35000,5