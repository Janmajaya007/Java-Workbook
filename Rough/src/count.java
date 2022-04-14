import java.util.Scanner;

public class count {

	static int Aterpsgame(int Arr[], int n)
	{   int np=0; 
	    
	   
        for(int i=n-1;i>0;i--){
          while( Arr[i]!=Arr[i-1]){
                np=i+1;
                break;
            }
        }
        return np;
	}
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   int Arr[]=new int[n];
		   for(int i=0;i<n ;i++) {
			   Arr[i]=sc.nextInt();
		   }
		 int p=  Aterpsgame(Arr, n);
		 System.out.println(p);
	}

}
