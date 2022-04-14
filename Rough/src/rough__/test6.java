package rough__;

import java.util.*;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int [] arr=DuplicateArray(n, arr);

	}

	public  int [] DuplicateArray(int input1, int[] input2) {
		 
		
		List<Integer> ar=new ArrayList<>();
		Arrays.sort(input2);
		for(int i=0;i<input1-1;i++) {
			if(input2[i]==input2[i+1]) {
				ar.add(input2[i]);
			}
		}
		int[] a=new int[ar.size()];
		 for(int i=0;i<ar.size();i++) {
			 a[i]=ar.get(i);
		 }
		 for(int i:a)
			 System.out.print(i+" ");
		 return a;
	}

}
