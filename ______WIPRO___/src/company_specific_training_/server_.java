package company_specific_training_;

/*
 * The cloud computing company Cloud can accommodate various requirements for resources. 
The company system runs two servers. For load balancing purposes, the load of the resources
gets transferred to the serves one by one. Initially , the first request goes to server 1,
the next request goes to server 2, and so an. The requests served by the servers are two types
i.e. one for memory deallocation (denoted by a negative number).   

Write an algorithm to find the total number of units of memory allocated/deallocated by 
the server 1 after processing all the requests.
Input
The first line of the input consists of an integer numOfReq, representing the number of requests(N).
The second line consists of N space-separated integers-req1,req2,…,reqN  representing the requests
for the allocation/deallocation of the respective memory units.
Output
Return an integer representing the total number of units of memory allocation/deallocated by 
the server 1 after processing all the requests.

Constraints
0<_ numOfReq<_105
-106<_reqi<_106
0<_i<=numOfReq
Example
Input
7
0  1 2  3  4  5 6 
2 -3 8 -6 -7 18 1

3+1 =4


Output
4


8 
0  1 2  3  4  5  6  7 
12 3 7 -9 -8 -10 19 15 


30  

i =0 to 7 
if(i%2==0)  ebven  arr[i]


 */
import java.util.Scanner;

public class server_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of data request");
		int n = sc.nextInt();
		System.out.println("Enter the memory of each allocation and dealocation operation");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		int sum = 0;
		for (int i = 0; i < n; i = i + 2) {
			sum = sum + arr[i];
		}
		System.out.println("Total amount of memory allocate and deallocate is -->" + sum);
	}

}
