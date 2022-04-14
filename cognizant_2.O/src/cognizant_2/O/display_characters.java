package cognizant_2.O;

import java.util.Scanner;

public class display_characters {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String products[] = new String[n];
		int price[] = new int[n];
		for(int i = 0; i < n; i++) {
			String arr [] = sc.nextLine().split(",");
			int disc = Integer.parseInt(arr[1])*Integer.parseInt(arr[2])/100;
			products[i] = arr[0];
			price[i] = disc;
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(price[i]<min)
				min=price[i];
		}
		for(int i=0;i<n;i++) {
			if(price[i]==min)
			{
				System.out.println(products[i]+" ");
			}
		}
	}

}


//4
//mobile,10000,20
//shoe,5000,10
//watch,6000,15
//laptop,35000,5
//
//4
//Mobile,5000,10
//shoe,5000,10
//WATCH,5000,10
//Laptop,5000,10