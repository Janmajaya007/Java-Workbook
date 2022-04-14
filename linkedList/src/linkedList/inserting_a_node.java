package linkedList;
/*
 * In this post, methods to insert a new node in linked list are discussed. A node can be added in three ways 
1) At the front of the linked list 
2) After a given node. 
3) At the end of the linked list.
 */
public class inserting_a_node {
  Node head;
    class Node{
	  int data;
	  Node next;
	  Node(int d){
		  this.data=d;
		  next=null;
	  }
  }
	public static void main(String[] args) {
		 inserting_a_node list=new inserting_a_node();
		 list.append(1);
		 list.insertBegin(0);
		 list.insert(list.head.next, 2);
		 list.printlist();
		 System.out.println();
		 list.append(11);
		 list.insertBegin(10);
		 list.append(11);
		 list.insertBegin(110);
		 list.insert(list.head.next, 12);
		 list.printlist();

	}
	//This method is to print the linkedList
	private void printlist() {
		// TODO Auto-generated method stub
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
			
	}
	//This method is to insert a node at a particular position in the linkedList
	private void insert(Node present, int i) {
		// TODO Auto-generated method stub
		if(present==null) {
			System.out.println("Present cannot be null");
		return;
		}
		
		Node node=new Node(i);
		node.next=present.next;
		present.next=node;
	}
	//this method is to insert a node in the beginning of the linkedList
	private void insertBegin(int i) {
		// TODO Auto-generated method stub
		Node first=new Node(i);
		first.next=head;
		 head=first;
	}
	//This method is to insert the node at the end of the linkedList
	private void append(int i) {
		// TODO Auto-generated method stub
		Node end=new Node(i);
		if(head==null) {
			head=new Node(i);
			return;
		}
		end.next=null;
		Node point=head;
		while(point.next!=null)
			point=point.next;
		
		point.next=end;
		return;
	}

}
