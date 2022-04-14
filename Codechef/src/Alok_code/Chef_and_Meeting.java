package Alok_code;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Codechef {
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc=new Scanner(System.in);
		    int tc=sc.nextInt();
		    while(tc-->0)
		    {
		        ArrayList<Integer> al=new ArrayList<>();
		        String time=sc.next();
		        int time1=print24(time);
		       // time1=Integer.parseInt(time);
		        //System.out.println(time1);
		        int n=sc.nextInt();
		        String[] l=new String[n];
		        String[] r=new String[n];
		        for(int i=0;i<n;i++)
		        {
		            l[i]=sc.next();
		            r[i]=sc.next();
		            int l1=print24(l[i]);
		            //int l1=Integer.parseInt(l[i]);
		            
		            int r1=print24(r[i]);
		            //int r1=Integer.parseInt(r[i]);
		            if(time1>=l1 && time1<=r1)
		            {
		                al.add(1);
		            }
		            else{
		                al.add(0);
		            }
		        }
		        System.out.println(al);
		       
		    }
		}
		catch(Exception e)
		{
		    return;
		}
	}
	static int print24(String str)
    {
    // Get hours
    int h1 = (int)str.charAt(1) - '0';
    int h2 = (int)str.charAt(0) - '0';
    int hh = (h2 * 10 + h1 % 10);
    // If time is in "AM"
    int hour=0;
    int min=0;
    int res=0;
    if (str.charAt(5) == 'A')
    {
        if (hh == 12)
        {
            //System.out.print("00");
            hour=0;
            // for (int i = 2; i<=4; i++)
            //     System.out.print(str.charAt(i));
            min=Integer.parseInt(str.substring(3,5));
        }
        else
        {
            hour=Integer.parseInt(str.substring(0,3));
            // for (int i = 0; i <= 4; i++)
            //     System.out.print(str.charAt(i));
            min=Integer.parseInt(str.substring(3,5));
        }
    }
    // If time is in "PM"
    else
    {
        if (hh == 12)
        {
            //System.out.print("12");
            hour=12;
            // for (int i = 2; i <= 4; i++)
            //     System.out.print(str.charAt(i));
            min=Integer.parseInt(str.substring(3,5));
        }
        else
        {
            hour= hh + 12;
           // System.out.print(hh);
           
            // for (int i = 2; i <= 4; i++)
            //     System.out.print(str.charAt(i));
             min=Integer.parseInt(str.substring(3,5));
        }
    }
    res=hour*100+min;
    //System.out.println(res);
    return res;
} 

}