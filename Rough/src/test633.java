import java.util.*;

public class test633 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num=sc.nextInt();
		find(n, num);
	}

	private static void find(int n, int num) {
		// TODO Auto-generated method stub
		int arr[]=new int[n];
		int res=0;int i=0;
		while(num>0) {
			res=num%10;
			arr[i]=res;
			i++;
			num=num/10;
		}
		Arrays.sort(arr);
		int number=0;
		for(int j=n-1;j>=0;j--) {
	number=number*10+arr[j];
			//System.out.println(arr[j]);
		}
		System.out.println(number);
	}

}
