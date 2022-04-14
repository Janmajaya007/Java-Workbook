import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		
		for(int i=0; i<n; i++) {
			String s=arr[i];
			 if(s.length()%2==0)
				 anagram(s);
			 else
				 System.out.println(-1);
		}
		sc.close();
	}
	public static void anagram(String s) {
		 String s1=s.substring(0, (s.length()/2));
		 String s2=s.substring( (s.length()/2), s.length() );
		 int arr1 []= new int [26]; // arr[3]=0,arr[0]=0 , arr[15]=
		 int sum=0;
		 
		 for(int i=0;i<s1.length();i++) { //carr
			 int index= s1.charAt(i)-'a';//c-3
			 arr1[index] ++;
		 }
		 for(int i=0;i<s2.length();i++) {// racrr   
			 int indexe= s2.charAt(i)-'a';// 
			 arr1[indexe]--;
		 }
		 
		 for(int i=0;i<26;i++) {
			 sum+=arr1[i];
		 }
		 System.out.println(sum);
		 //str 1= pencil str2=
	}

}
