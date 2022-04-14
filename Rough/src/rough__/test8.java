package rough__;

public class test8 {

	public static void main(String[] args) {
		try {
			int a=5;
			System.out.println(a/0);

		}
		catch (Exception e){
			System.out.println("Error");
		}
finally {
	System.out.println("Ram");
}
	}

}
