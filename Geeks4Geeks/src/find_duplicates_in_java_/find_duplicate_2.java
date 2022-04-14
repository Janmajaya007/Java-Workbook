package find_duplicates_in_java_ ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class find_duplicate_2 {
	
	public static ArrayList<Integer> ifduplicates(int[] arr, int n) {
		ArrayList<Integer> fre=new ArrayList<>();
	    Arrays.sort(arr);
	int c=0; int t=-1; boolean present=false;
	for(int i=0;i<n-1;i++){
	  for(int j=i+1;j<n;j++){
	      if(arr[i]==arr[j]){
	         if(fre.contains(arr[i])) {
	         	break;
	          }
	         else {
	         	fre.add(arr[i]);
	         	present =true;
	         	}
	      } }}
	
	if (present == true) {
		 
	return fre;
	}
	else {
	  fre.add(-1);
	  return fre;
	}	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr []=  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		 System.out.println(ifduplicates(arr, n));
		 sc.close();
	}
}
