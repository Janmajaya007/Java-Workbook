package company_specific_training_;

import java.util.Arrays;
import java.util.Scanner;
/*
A game company has designed an online lottery game, Bingo. In this game , Nnumber cards are displayed . 
Each card has a value on it. The value can be negative or positive. The player must choose two cards. To 
win the game, the product of the  values of the two cards must be the maximum value possible for any pair 
of cards in the display. The winning amount will be  the sum of the two cards chosen by the player.
Write an algorithm to find the winning amount as the sum of the values of the two cards whose product value is maximum.
INPUT:
The first line of the input consists of an integer numCards, representing the number of cards(N).
The second line consists of N space-separated integers  ,,…., representing the values on the cards.
OUTPUT:
Print an integer representing the sum of the values of the two cards whose product value is maximum.
Example:
Input:
7
9 -3 8 -6 -7 8 10
Output:
19

EXPLANATION:

The maximum product of the values is 90..i.e 9*10
So,the sum of the values of the selected cards is 19.
*/
public class Bingo___ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of cards");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the card numbers");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int amount=0;
		Arrays.sort(arr);
		int res1 =  (arr[n - 1] )*  (arr[n - 2]);
		int res2 =  (arr[0] )*  (arr[1]);
		if(res1>res2)
			amount=(arr[n - 1] )+(arr[n - 2]);
		else
			amount=(arr[1] )+(arr[0]);
//		System.out
//				.println("The winners numbers are" + arr[n - 1] + " and " + arr[n - 2] + "and wining amount is " + res);
//		System.out.println("The maximum product is  "+(arr[n - 1]*arr[n - 2]));
		System.out.println("Winning amount is"+amount);
		sc.close();
	}

}
