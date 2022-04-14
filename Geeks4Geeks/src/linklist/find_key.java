 package linklist;

import java.util.Scanner;

class node{
	int data;
	node next;
	node(int x){
		data=x;
		next=null;
	}
}
  class find_key {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 node head=new node(40);
		 head.next=new node(20);
		 head.next.next=new node(52);
		 head.next.next.next=new node(80);
		 head.next.next.next.next=new node(20);
		 System.out.println("Enter the you want to  find");
		 int key=sc.nextInt();
		 int place= search(head,key);
		 System.out.println(place);
	}

	public static int search(node head, int key) {
		// TODO Auto-generated method stub
		int pos=1;
		node curr=head;
		while(curr!=null) {
			if(curr.data==key) {
				return pos;
			}
			else {
				pos++;
				curr=curr.next;
			}
		}
		return -1;
	}

}
