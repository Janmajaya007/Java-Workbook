package exception_handling;
import java.util.*;
public class ArrayException{
    public static void main (String[] args) {
    	ArrayException ae = new ArrayException();
    	String str = ae.getPriceDetails();
    	System.out.println(str);
    }
    
    public String getPriceDetails()   {
        Scanner sc = new Scanner(System.in);
       try {
    	   System.out.println("Enter the number of elements in the array");
           int n = sc.nextInt();
           int arr [] = new int[n];
            System.out.println("Enter the price details");
           for (int i=0; i<n; i++){
               arr[i]=sc.nextInt();
           }
           System.out.println("Enter the index of the array element you want to access");
           int index=sc.nextInt();
           sc.close();
           return "The array element is "+arr[index];
       }
       catch(InputMismatchException e){
    	   return "Input was not in the correct format";
       } 
       catch(IndexOutOfBoundsException e){
    	   return "Array index is out of range";
       } 
    }
}