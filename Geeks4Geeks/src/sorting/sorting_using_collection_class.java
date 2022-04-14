package sorting;
import java.util.*;
 
class mySort implements Comparator<Integer>
{
	public int compare(Integer a , Integer b) {
	return a-b;
	}
}
public class sorting_using_collection_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		Integer arr[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		 Arrays.sort(arr, new mySort());
		 System.out.println(Arrays.toString(arr));
		sc.close();

	}

}
