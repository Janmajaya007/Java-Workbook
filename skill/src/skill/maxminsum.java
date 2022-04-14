 package skill;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class maxminsum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
  int s=0; int su=0;
    int max= Math.max(arr[4], Math.max(arr[3], Math.max(arr[2], Math.max(arr[1], arr[0]))));
    int min= Math.min(arr[4], Math.min(arr[3], Math.min(arr[2], Math.min(arr[1], arr[0]))));
    
    for (int i=0;i<5;i++) {
        if(arr[i]!=max) {
            s=s+arr[i];
        }
    }
    for (int i=0;i<5;i++) {
        if(arr[i]!=min) {
            su=su+arr[i];
        }
    }
    System.out.println(s+" "+su);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}