 package skill;
import java.io.*;
import java.util.*;
class legendary_Alok{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println("Enter a type");
		int n=sc.nextInt();
		findCharsOrDigitSum(s,n);
		//System.out.println(res);
	}
	public static void findCharsOrDigitSum(String input1,int input2)
	{
		// String s1=input1;
		// int n2=input2;
		if(input2==0)
		{
			int sum=0;
			for(int i=0;i<input1.length();i++)
			{
				char ch=input1.charAt(i);
				if(Character.isDigit(ch))
				{
					int n=Character.getNumericValue(ch);
					sum+=n;
				}
			}
			System.out.println(sum);
			 
		}
		if(input2==1)
		{
			String str="";
           for(int i=0;i<input1.length();i++)
           {
              if((input1.charAt(i)>='a' && input1.charAt(i)<='z')||(input1.charAt(i)>='A' && input1.charAt(i)<='Z')){
              	str+=input1.charAt(i);
              }
           }
           System.out.println(str);
		}	
	}
	
}