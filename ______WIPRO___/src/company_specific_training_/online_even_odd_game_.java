package company_specific_training_;

/*
 * .  You are playing an online game. In the game, a list of N numbers is given. The player has to 
arrange the numbers so that all the odd numbers of the list come after the even numbers. 
Write an algorithm to arrange the given list. Such that all the odd numbers of the list come 
after the even numbers.

Input
The first line of the input consists of an integer num, representing the size of the list (N).
The second line of the input consists of N space-separated integers representing the values of
the list.

Output
Print N space-separated integers such that all the odd numbers of the list come after
the even numbers.

Example
Input
8
10 98 12 22 3 33 21 11

Output:

8
1 4 5 8 7 9 6 10


 */
import java.util.Scanner;

public class online_even_odd_game_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of cards");
		int n = sc.nextInt();
		System.out.println("Enter the cards value");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int i, j = 0;
		for (i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;

			}

		}
		for (int a : arr)
			System.out.print(a + " ");
	}

}
