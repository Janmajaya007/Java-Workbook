import java.util.Scanner;

public class test94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String ss[]=str.split(" ");
for(int i=1;i<ss.length;i=i+2) {
	System.out.print(ss[i]+" ");
}
	}

}
