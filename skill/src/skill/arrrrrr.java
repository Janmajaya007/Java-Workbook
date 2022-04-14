package skill;

import java.util.Scanner;

public class arrrrrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      int n=sc.nextInt();
      
      if(n<=0) {
    	  System.out.println(n+" is too small");
      }
      else if(n>20) {
    	  System.out.println(n+" exceeds the limit");
      }
      else {
      System.out.println("Enter the numbers ");
      int arr[]= new int[n];
      for(int i=0; i<n;i++) {
    	  arr[i]=sc.nextInt();   
    	  int a=arr[i];
    	  if(a<100 || a>900) {
    		  System.out.println(a+" is not in the range");
    		  break;
    	  }
    	  
    
      for (int j=0; j<n; j++) {
    	  int num=arr[j];
    	
    	  while(num!=0) {
    		  int m=num%10;
    		  num=num*10+m;
    		  num=num/10;
    	  }
    	  String ss=Integer.toString(num);
    	  ss = ss.substring(1);
    	  int number=Integer.parseInt(ss);
    	  System.out.println(number);
      }

      }
	
      }

	}
	}
