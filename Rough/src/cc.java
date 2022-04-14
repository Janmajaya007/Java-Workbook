import java.io.*;
		import java.util.*;
public class cc {
	public static void main(String[] args) {		
		  Scanner in=new Scanner(System.in);
		  int a=0;
		  a=in.nextInt();
		  int s=0;
		  s=in.nextInt();

		  int x,y,r;

		  if(s<=0)
		   System.out.println("Shifts too small"); 
		  else if(a>8000)
		   System.out.println("Salary too large");
		  else if(a<=0)
		   System.out.println("Salary too small");
		  else
		  {
		    r=a/2;
		    x=(2*a*s)/100;
		    y=r+x;
		    System.out.println(y);
		  }
		 }
}
