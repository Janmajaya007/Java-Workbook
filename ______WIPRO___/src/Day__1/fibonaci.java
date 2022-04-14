package Day__1;

import java.util.Scanner;
// This will print nth fibonaci number
//public class fibonaci {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Scanner sc= new Scanner(System.in);
//System.out.println("Enter the N");
//int n=sc.nextInt();
//int a=0,b=1;
// if(n==1)
//	 System.out.println(a);
// if(n==2)
//	 System.out.println(b);
// if(n>2) {
//	for(int i=2;i<n;i++) {
//		 int temp=a+b;
//		 a=b;
//		 b=temp;
//	 }
// }
// System.out.println(b);
//	}
//
//}
//Java program to print fibonacci series up to n 
//This will prin the nth series of fibonaci number
public class fibonaci 
{
public static void main (String[]args) 
{
    //scanner class declaration
    Scanner sc = new Scanner (System.in);
  
    //input from user
    System.out.print ("Enter the limit : ");
  
    int lim = sc.nextInt ();
    
    if (lim > 0)
    {
	   
	   int y = 0, z = 1, s;
	  //display starting two numbers of series
	  System.out.print ("Fibonacci Series : " + y + "  " + z + "  ");
	
	  //perform iterations till the limit entered by the user
	  while (z <= lim)
	  {
	    s = y + z;
	    y = z;
	    z = s;
	    
	    //condition for forcing z that it should not be printed when its value is greater than limit
	    if (z <= lim)
	      System.out.print (z + "  ");
	  }
    }
  
  else
    System.out.print ("Wrong Input");
  
  //closing scanner class(not compulsory, but good practice)
  sc.close ();
}

}