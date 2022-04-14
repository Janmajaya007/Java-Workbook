package searching___;

import java.util.Scanner;

public class square_root_of_a_given_number_ {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number to find square root");
		 int n=sc.nextInt();
		 int root=square_root(n);
		 System.out.println("The square root of "+n+" is "+root+" ");
		 sc.close();
	}

	private static int square_root(int n) {
		// TODO Auto-generated method stub
		int low=1, high=n, ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int sqr=mid*mid;
			if(mid==sqr)
			{
				return mid;
			}
			else if(sqr>n) {
				high=mid-1;
			}
			else {
				low=mid+1;
				ans=mid;
			}
			
		}
		return ans;
	}

}
