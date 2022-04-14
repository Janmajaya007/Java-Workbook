package com.datastructure;

import java.util.*;

public class sparseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of String array");
		int n = sc.nextInt();
		System.out.println("Enter the size of Query array");
		int q = sc.nextInt();
		List<String> str = new ArrayList<>();
		List<String> query = new ArrayList<>();
		System.out.println("Enter the String array");
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			str.add(s);
		}

		System.out.println("Enter the Query array");
		for (int i = 0; i < q; i++) {
			String s = sc.next();
			query.add(s);
		}
		List<Integer> count = matchingStrings(str, query);
		System.out.println(count);
	}

	private static List<Integer> matchingStrings(List<String> str, List<String> query) {
		List<Integer> count = new ArrayList<>();
		int c = 0;
		for (int i = 0; i < query.size(); i++) {
			for (int j = 0; j < str.size(); j++) {
				if ((query.get(i)).equals(str.get(j))) {
					c++;
				}
			}
			count.add(c);
			c = 0;
		}
		return count;
	}

}
