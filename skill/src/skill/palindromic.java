package skill;
import java.io.*;
import java.util.*;

public class palindromic {

    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        // Enter your code here. Print output to STDOUT. 
        StringBuffer name1 =new StringBuffer();
        StringBuffer name2 =new StringBuffer();
        for(int i=0; i<A.length(); i++){
            name1.append(A.charAt(i));
            
        }
        System.out.println(name1);
        
       // num.append(str.charAt(i)
        for(int j=A.length()-1; j>=0; j-- ){
            name2.append(A.charAt(j));
        }
        
        System.out.println(name2);
        
        String name= name2.toString();
        String name3= name1.toString();
       
        if( name3.compareTo(name)==0)
            System.out.println("Yes");
            else 
            System.out.println("No");
       
    }
}

