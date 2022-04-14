import java.util.Arrays;

public class shorting_Array {
	static String sortString(String str) { 
        char []arr = str.toCharArray(); 
        Arrays.sort(arr); 
        System.out.print(String.valueOf(arr));
		return str; 
    } 

	public static void main(String[] args) {
		String S = "Janmajaya"; 
		String s=S.toLowerCase();
        String ss= sortString(s); 

	}

}
