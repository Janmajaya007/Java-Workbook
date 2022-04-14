import java.util.Scanner;

public class Apple_and_Orange {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
        int s=sc.nextInt();
       int t=sc.nextInt();
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int m=sc.nextInt();
        int n=sc.nextInt();
        
       
    int apples []=new int[m];
    int oranges []=new int[n];
    
     for(int i=0;i<m;i++) {
    	apples[i]=sc.nextInt();
    }
     
     for(int i=0;i<n;i++) {
    	oranges [i]=sc.nextInt();
    }
     
int apple=0; int orange=0;
     
     for(int i=0; i<apples.length;i++){
         int pos=a+apples[i];
         if(pos>=s && pos<=t){
             apple++;
         }
     }
     
     for(int i=0; i<oranges.length;i++){
         int pos=b+oranges[i];
         if(pos>=s && pos<=t){
             orange++;
         }
     }
      System.out.println(apple);
      System.out.println(orange);

     
    sc.close();

	}
 
}
