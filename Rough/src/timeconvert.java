
public class timeconvert {

	public static void main(String[] args) {
		 String s="07:50 PM";
int time= convert(s);
System.out.println(time);
	}

	public static int convert(String str) {
		 int h1 = (int)str.charAt(1) - '0';
		    int h2 = (int)str.charAt(0) - '0';
		    int hh = (h2 * 10 + h1 % 10);
		 int t=00;
		 if(str.charAt(6)=='A') {
			 if(hh==12) {
				 int m=Integer.parseInt( str.substring(3, 5));
				 return m;
			 }
			 else{
				 int mi=hh*100+(Integer.parseInt(str.substring(3, 5)));
				 return mi;
			 }
		 }
		 else {
			 if(hh==12) {
				 int m=hh*100+(Integer.parseInt(str.substring(3, 5)));
				 return m;
			 }
			 else{
				 int mi=(12+hh)*100+(Integer.parseInt(str.substring(3, 5)));
				 return mi;
			 }
			 
		 }
	}

}
