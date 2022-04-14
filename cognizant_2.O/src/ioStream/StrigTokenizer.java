package ioStream;
import java.util.*;
public class StrigTokenizer {

	public static void main(String[] args) {
		String str= " I am very Happy to see you that you are back safe";
		StringTokenizer st = new StringTokenizer(str);
		//StringTokenizer st = new StringTokenizer(str, ",");
		// StringTokenizer st = new StringTokenizer(str, " ", true);
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		for(String strr  : st)
			System.out.println(st);
	}

}
