import java.util.Scanner;

public class reverse_of_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        // Enter your code here. Print output to STDOUT. 
        //StringBuffer name1 =new StringBuffer();
        StringBuffer name2 =new StringBuffer();
        //for(int i=0; i<A.length(); i++){
           // name1.append(A.charAt(i));
            System.out.println(A.length());
        //}
        //System.out.println(name1);
       // 
       // num.append(str.charAt(i)
        for(int j=A.length()-1; j>=0; j-- ){
             name2.append(A.charAt(j));
         }
        System.out.println(name2);
        ///if(name1==name2)
       // System.out.println("Yes");
	}

}
