
public class object_swaping {
 public static void swap (Integer i, Integer j) {
	 Integer temp=i;
	 i=j;
	 j=temp;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i=new Integer(10);
Integer j=new Integer(20);
swap(i,j);
System.out.println(i+"  "+j);
	}

}
