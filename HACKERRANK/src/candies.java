  
import java.util.*;
public class candies {
public static void main(String[] args)   {
    Scanner sc= new Scanner(System.in);
    long n=sc.nextLong();
    long arr[]= new long[(int) n];
    for(long i=0; i<n; i++){
        arr[(int) i]=sc.nextInt();
    }
    long  left []= new long [ n];;
    long   right []= new long[(int) n];;
      left[0]=1;
      for(int   i=1; i<n; i++){
          if(arr[i]<=arr[i-1])
          {
              left[i]=1;
          }
          else{
              left[i]=left[i-1]+1;
          }
      }
        right[(int) (n-1)]=1;
        for(long j=n-2; j>0;j--){
            if(arr[(int) j]<=arr[(int) (j+1)]){
                right[(int) j]=1;
            }
            else{
                right[(int) j]=right[(int) (j+1)]+1;
            }
        }
        long ans=0;
        for(  int k=0;k<n;k++){
            ans+=Math.max(left[k], right[k]);
        }
        System.out.println(ans);
    }
}
