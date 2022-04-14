package ____infosys____;

import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Infosys_Bitwisesubsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		Set<Integer> hs = new HashSet<>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			while(arr[i]<arr[i+1])
			{
			if(arr[i]<arr[i+1])
			{
			int c=arr[i]&arr[i+1];
			int d=arr[i]|arr[i+1];
			if(c*2<d)
			{
				hs.add(arr[i]);
				hs.add(arr[i+1]);
			}
			else {
				continue;
			}
			}
			else {
				continue;
			}
			}
		}
		System.out.println(hs.size());

	}

}