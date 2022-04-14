package testSeries;
 
import java.util.*;

public class Repeated_Elements_ {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         int len1=sc.nextInt();
         int len2=sc.nextInt();
         int [] arr1=new int [len1];
         for(int k=0;k<len1;k++){
             arr1[k]=sc.nextInt();
         }
         int [] arr2=new int[len2];
         for(int k=0;k<len2;k++){
             arr2[k]=sc.nextInt();
         }
        //  Arrays.sort(arr1);
        //  Arrays.sort(arr2);
         int i, j, c=0;
          List<Integer> check=new ArrayList<>();
          for(i=0;i<len1;i++){
              check.add(arr1[i]);
          }
          for(j=0;j<len2;j++)
          {
              if(check.contains(arr2[j]))
              {
                  c++;
              }
          }
          int len= (len1+len2);
          System.out.println(len-(2*c));
          sc.close();

	}

}
