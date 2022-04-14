import java.util.Scanner;

public class missing_number_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		int m=n-1;
		System.out.println("Enter the Array");
		int arr[]=new int[m];
		for(int i=0;i<m;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(missingNum(arr,m));
		sc.close();

	}

	private static int missingNum(int[] array, int n) {
		// TODO Auto-generated method stub
		int a[]=new int[n+1];
		int num=0;
		for(int i=0;i<n;i++) {
			a[array[i]-1]++;
		}
		for(int i=0;i<=n;i++) {
			if(a[i]==0) {
				  num=i+1;
			}
		}
		return num;
	}

}
