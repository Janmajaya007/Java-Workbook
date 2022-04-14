import java.util.Arrays;

public class searchingArray {
public static void main(String[] args) {
	String String arrcities[]= {"Pune","Mumbai","Bengaluru","Chennai"};
	String str1="Bengaluru";
	Arrays.sort(arrcities);
	iint pos=Arrays.binarySearch(arrcities, str1);
	System.out.println(str1+"found in positiojn "+pos);
}
}
