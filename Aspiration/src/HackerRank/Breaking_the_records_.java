package HackerRank;
import java.util.Scanner;
public class Breaking_the_records_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
breaking(arr, n);
sc.close();
	}
	public static void breaking(int[] arr, int n) {
		// TODO Auto-generated method stub
		//10 5 20 20 4 5 2 25 1
		int max=arr[0], min=arr[0], maxc=0, minc=0;
		for(int i=1;i<n;i++) {
			if(max<arr[i])
			{
				maxc++;
				max=arr[i];
			}
		   if(min>arr[i])
		   {
			   minc++;
			   min=arr[i];
		   }
		}
		System.out.println(maxc+" "+minc);
	}
}
