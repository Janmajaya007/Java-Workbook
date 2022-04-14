package linklist1;

import java.util.Scanner;

class node3{
	   int data; 
	   node3 next;
	    node3(int x){
		   this.data=x;
		   this.next=null;
	   }
}

public class sortedly_insert_node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		node3 head=null;
		head=insertEnd(head,10);
		head=insertEnd(head,20);
		head=insertEnd(head,30);
		head=insertEnd(head,40);
		head=insertEnd(head,50);
		System.out.println("The Given Linklist is following");
		Show(head);
		System.out.println();
		
		System.out.println("enter the data value to be insert");
		int value=sc.nextInt();
		
		System.out.println("The sorted list after insert");
		node3 sort=insertnodetosort(head,value);
		Show(sort);
	}
 	private static node3 insertnodetosort(node3 head, int value) {
		node3 temp=new node3(value);
		if(head==null) {
			return null;
		}
		node3 curr=head;
		
		if(curr.data>temp.data) {
			temp.next=head;
			return temp;
		}
		
		while(curr.next.data<temp.data) {
			curr=curr.next;
		}
		if(curr!=null) {
		temp.next=curr.next;
		curr.next=temp;
		}
		 
			curr.next=temp;
		
		 
		return head;
 	}

	private static void Show(node3 head) {
		// TODO Auto-generated method stub
		node3 curr=head;
		if(head==null) {
			System.out.println("The list is empty");
		}
		while(curr!=null) {
			System.out.print(curr.data +"   ");
			curr=curr.next;
		}
	}

	private static node3 insertEnd(node3 head, int i) {
		// TODO Auto-generated method stub
		node3 temp=new node3(i);	
		if(head==null) {
			 return temp;
			 }
		node3 curr= head;
		while(curr.next!=null) { 
			curr=curr.next;}
			curr.next=temp;
		return head;
		
	}

}
