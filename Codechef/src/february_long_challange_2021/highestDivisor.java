 package february_long_challange_2021;

import java.util.*;
 

 
class highestDivisor
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 int c=1;
	 for(int i=1;i<=10;i++){
	     if(N%i==0){
	         if(i>c){
	             c=i;
	         }
	     }
	 }
	  System.out.println(c);
	  sc.close();
	}
}
 