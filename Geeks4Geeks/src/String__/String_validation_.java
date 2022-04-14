package String__;

import java.util.Scanner;

public class String_validation_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the password");
String password=sc.nextLine();
boolean isPasswordCorrect=   passwordValidatation(password);
if(isPasswordCorrect==true) {
System.out.println("Yes the password is correct");
}
else if(isPasswordCorrect==false) 
{
	System.out.println("Enter correct password");

}
sc.close();
	}

	private static   boolean  passwordValidatation(String str) {
		
		 if(str.length()<10)
             return false;
             
     //Initializing different
     //boolean variables
     //to false for different conditions
     boolean upper=false;
     boolean lower=false;
     boolean special=false;
     boolean numeric=false;
     
     
     for(int i=0;i<str.length();i++)
     {
         
         if(Character.isUpperCase(str.charAt(i)))
         {
             upper=true;//making upper true if the character is in UpperCase
         }
         else if(Character.isLowerCase(str.charAt(i)))
         {
             lower=true;//making lower true if character is in LowerCase
         }
         else if(Character.isDigit(str.charAt(i)))
         {
             numeric=true;//making numeric true if the character is a digit
         }
         else
         {
             special=true;//making special true if the character is special
         }
     }
     
     //returning true if all conditions are met
     //else returning false
     return upper && lower && numeric && special;
		
	}

}
