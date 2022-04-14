package sorting;

import java.util.*;

public class collection_sort_of_list {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Arraylist Decalred");

		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("ArrayList Before sort");
		System.out.println(arr);

		System.out.println("Array sorted in increasing order");
		Collections.sort(arr);
		System.out.println(arr);

		System.out.println("Array sorted in decreasing order");
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);

	}

}
