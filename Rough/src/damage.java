 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class damage {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc=new Scanner(System.in);
					  int n=sc.nextInt();
					  int arr[]=new int[n];
					  for(int i=0;i<n;i++){
						  arr[i]=sc.nextInt();
					  }
					  int sum1=0, sum2=0;
					  for(int i=0;i<n;i++){
                        if(i%2==0){
							sum1+=arr[i];
						}
						else{
							sum2+=arr[i];
						}
					  }
					  if(sum1>sum2){
						  System.out.println("Professor");
					  }
					  else if(sum1<sum2){
						   System.out.println("Harry");
					  }

	}
}