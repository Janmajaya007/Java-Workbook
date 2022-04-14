 import java.util.*;

public class intersection_of_two_arrays_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("input n");
      int n=sc.nextInt();
     
      System.out.println("Input array a");
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  a[i]=sc.nextInt();
      }
      System.out.println("input m");
      int m=sc.nextInt();
      
      System.out.println("Input array b");
      int b[]=new int[m];
      for(int i=0;i<m;i++)
      {
    	  b[i]=sc.nextInt();
      }
    System.out.println(intersection(a, b,n, m));
      sc.close();
	}

	private static int intersection(int[] a, int[] b, int n, int m) {
		// TODO Auto-generated method stub
 		int c ,i=0,j=0;
		 Set<Integer> hs = new HashSet<>();
       Set<Integer> hs1 = new HashSet<>();
 
        for (  i = 0; i < a.length; i++)
            hs.add(a[i]);
      
        while(j<b.length)
        {
        if (hs.contains(b[j]))
        {
        	hs1.add(b[j]);
        }
        j++;
        } 
        c=hs1.size();
 return c;
		
	}

}
