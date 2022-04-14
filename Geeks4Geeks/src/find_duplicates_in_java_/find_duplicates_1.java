package find_duplicates_in_java_;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;



 
public class find_duplicates_1 {
	
	private static char[] duplicates(int[] arr, int n) {
		 
		 Map<Integer,Integer> map = new HashMap<>();
	        int count = 0;
	        boolean dup = false;
	        for(int i = 0; i < n; i++){
	            if(map.containsKey(arr[i])){
	                count = map.get(arr[i]);
	                map.put(arr[i], count + 1);
	            }
	            else{
	                map.put(arr[i], 1);
	            }
	        }
	         
	        for(Entry<Integer,Integer> entry : map.entrySet())
	        {
	            // if frequency is more than 1
	            // print the element
	            if(entry.getValue() > 1){
	                System.out.print(entry.getKey()+ " ");
	                dup = true;
	            }
	        }
	        // no duplicates present
	        if(!dup){
	            System.out.println("-1");
	        }
			return null;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr []=  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		 System.out.println(duplicates(arr, n));
		 sc.close();
	}
}
