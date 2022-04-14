package cognizant_2.O;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Authority {
 public static void main (String[] args) {
     
     Scanner sc = new Scanner (System.in);
     System.out.println("Inmate's name:");
     String name = sc.nextLine();
     System.out.println("Inmate's father's name:");
     String fatherName = sc.nextLine();
     /* check for valid name */
     boolean name_ =validName(name);
     boolean fname_ = validName(fatherName);
     
     if (name_ == true && fname_ == true)
     {
         String datum= name.concat(" ").concat(fatherName);
         System.out.println(datum.toUpperCase());
     }
     else
     {
       System.out.println("Invalid name");  
     }
     sc.close();
 }
 public static boolean validName(String str)
 {
   String regex = "^[a-zA-Z][a-zA-Z\\s]+$";
   Pattern p = Pattern.compile(regex);
   
   if(str == null)
   return false;
   
   Matcher m = p.matcher(str);
   return m.matches();
 }
}
