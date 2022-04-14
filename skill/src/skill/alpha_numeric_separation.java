package skill;

import java.util.Scanner;

class alpha_numeric_separation
	{ 
		static void splitString (String str, int n ) 
		{ 
			StringBuffer alpha = new StringBuffer(), 
			num = new StringBuffer() ; 
			
			for (int i=0; i<str.length(); i++) 
			{ 
				if (Character.isDigit(str.charAt(i))) 
					num.append(str.charAt(i)); 
				else if(Character.isAlphabetic(str.charAt(i))) 
					alpha.append(str.charAt(i)); 
				  
		 
		} 
			
			String numbers1 =num.toString();
			String alphabet1  =alpha.toString();
			
			String numbers =numbers1.toUpperCase();	
			String alphabet=alphabet1.toUpperCase();
			 int nu=numbers.length();
			 int al=alphabet.length();
			 
			 
			 if (n==0 && nu!=0 ) {
				 System.out.println(numbers); 
				 System.out.print("The sum of all digits in the number is =");
				 addnumbers(numbers);
				
			}
			else if(n==0 && nu==0)   {
				 System.out.println("ZERO");
			}
			 
			 
			if (n==1 && al!=0 ) {
				 System.out.println(alphabet); 
				 System.out.print("The sum of all ascii values in the word  is =");
					addalphabets(numbers);
					
				}
				else if(n==1 && al==0)   {
					 System.out.println("ZERO");
				}
			 
			 
		}
	 
		 static void addnumbers(String s) {
			 int sum=0;
			 for(int i=0; i<s.length(); i++) {
 					 sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
 				}
				System.out.println(sum);
					
		 }
		 static void addalphabets(String s) {
			 int sum=0;
			 for(int i=0; i<s.length(); i++) {
			 
				 sum+=s.charAt(i);
			 }
			 System.out.println(sum);
		 }
		public static void main(String args[]) 
		{ 
			Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the input1 "); //Alphanumeric String will be input
			String input1 =sc.nextLine();
 			 System.out.println("Enter input2");  // 0 or 1 should be input
			   int input2=sc.nextInt();
			   splitString(input1, input2);
			 
			
		}}
	 
