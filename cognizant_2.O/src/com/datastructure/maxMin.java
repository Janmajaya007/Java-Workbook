package com.datastructure;
import java.util.*;
public class maxMin {

	public static void main(String[] args) {
		
		
		List <Integer> arr= new ArrayList<>();
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int value =sc.nextInt();
			arr.add(value);
		}
		
		 MinMax(arr);
	}

	public static void MinMax(List<Integer> arr) {
		int min=arr.get(0);
		int max=arr.get(0);
		long total=0;
		for(int n: arr) {
			total+=n;
			if(min >n)
				min=n;
			if(max <n)
				max=n;
		}
		System.out.println((total-max)+" "+(total-min));
	}

	 
}
