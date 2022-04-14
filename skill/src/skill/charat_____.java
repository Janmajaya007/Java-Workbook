package skill;

public class charat_____ {
	   void split(String s) {
		String str=s;
		
		for (int i=0; i<str.length();i++) {
			  System.out.println( str.charAt(i));	
		}	
	}
	void chekletter(String name) {
		String na=name;
		for (int j=0; j<na.length();j++) {
		 
		char ch1= 'a';char ch2= 'e';char ch3= 'i';char ch4= 'o';char ch5= 'u';
		if(na.charAt(j)== ch1)
			System.out.println(na.charAt(j)+"    Vowel");
		else if(na.charAt(j)== ch2)
			System.out.println(na.charAt(j)+"    Vowel");
		else if(na.charAt(j)== ch3)
			System.out.println(na.charAt(j)+"    Vowel");
		else if(na.charAt(j)== ch4)
			System.out.println(na.charAt(j)+"    Vowel");
		else if(na.charAt(j)== ch5)
			System.out.println(na.charAt(j)+"    Vowel");
		else  
			System.out.println(na.charAt(j)+"     consonant");
	}
	
	}
public static void main(String[] args) {
		 
		charat_____ c= new charat_____();
		c.split("Janmajaya ");
		c.chekletter("Janmajaya ");

	}

}
